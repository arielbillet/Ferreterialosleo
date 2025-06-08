import java.util.*;

public class MenuPrincipal {
    private List<Producto> productos;
    private List<Cliente> clientes;
    private List<Administrador> administradores;
    private List<Movimiento> movimientos;
    private List<Reporte> reportes;
    private List<Alerta> alertas;
    private Scanner scanner;

    public MenuPrincipal() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        administradores = new ArrayList<>();
        movimientos = new ArrayList<>();
        reportes = new ArrayList<>();
        alertas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            mostrarMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    registrarMovimiento();
                    break;
                case 4:
                    generarReporte();
                    break;
                case 5:
                    verAlertas();
                    break;
                case 0:
                    salir();
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Registrar movimiento de stock");
        System.out.println("4. Generar reporte");
        System.out.println("5. Ver alertas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarProducto() {
        System.out.print("Ingrese ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese stock: ");
        int stock = scanner.nextInt();

        Producto producto = new Producto(id, nombre, descripcion, precio, stock);
        productos.add(producto);
        System.out.println("Producto agregado exitosamente.");

        if (stock < 5) {
            crearAlerta(producto);
        }
    }

    private void listarProductos() {
        System.out.println("\n--- Lista de Productos ---");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    private void registrarMovimiento() {
        System.out.print("Ingrese ID del producto: ");
        int idProducto = scanner.nextInt();
        Producto producto = buscarProductoPorId(idProducto);
        if (producto == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.print("Ingrese tipo de movimiento (ingreso/egreso): ");
        String tipo = scanner.next();
        System.out.print("Ingrese cantidad: ");
        int cantidad = scanner.nextInt();

        if (tipo.equalsIgnoreCase("ingreso")) {
            producto.setStock(producto.getStock() + cantidad);
        } else if (tipo.equalsIgnoreCase("egreso")) {
            producto.setStock(producto.getStock() - cantidad);
            if (producto.getStock() < 5) {
                crearAlerta(producto);
            }
        } else {
            System.out.println("Tipo de movimiento no válido.");
            return;
        }

        Movimiento movimiento = new Movimiento(movimientos.size() + 1, tipo, producto, cantidad, new Date());
        movimientos.add(movimiento);
        System.out.println("Movimiento registrado.");
    }

    private void generarReporte() {
        System.out.print("Ingrese tipo de reporte: ");
        String tipo = scanner.nextLine();
        Reporte reporte = new Reporte(reportes.size() + 1, tipo, new Date(), null);
        reportes.add(reporte);
        System.out.println("Reporte generado exitosamente.");
    }

    private void verAlertas() {
        System.out.println("\n--- Alertas Actuales ---");
        for (Alerta alerta : alertas) {
            System.out.println(alerta);
        }
    }

    private Producto buscarProductoPorId(int id) {
        for (Producto producto : productos) {
            if (producto.getIdProducto() == id) {
                return producto;
            }
        }
        return null;
    }

    private void crearAlerta(Producto producto) {
        Alerta alerta = new Alerta(alertas.size() + 1, producto, new Date(), "activa");
        alertas.add(alerta);
        System.out.println("Alerta generada por bajo stock.");
    }

    private void salir() {
        System.out.println("Gracias por utilizar el sistema de la Ferretería Los Leos. ¡Hasta pronto!");
    }
}
