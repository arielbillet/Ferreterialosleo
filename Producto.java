public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int stock;
    private int stockMinimo;
    private double precio;

    public Producto(int idProducto, String nombre, String descripcion, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.stockMinimo = 5; // valor por defecto
    }

    // Getters y setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos de negocio
    public boolean hayStock(int cantidadSolicitada) {
        return stock >= cantidadSolicitada;
    }

    public boolean necesitaReposicion() {
        return stock < stockMinimo;
    }

    public void disminuirStock(int cantidad) {
        if (hayStock(cantidad)) {
            stock -= cantidad;
        }
    }

    public void aumentarStock(int cantidad) {
        stock += cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", stockMinimo=" + stockMinimo +
                ", precio=" + precio +
                '}';
    }
}
