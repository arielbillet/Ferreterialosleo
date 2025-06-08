import java.util.Date;

public class Movimiento {
    private int idMovimiento;
    private String tipo; // "ingreso" o "egreso"
    private Producto producto;
    private int cantidad;
    private Date fecha;

    public Movimiento(int idMovimiento, String tipo, Producto producto, int cantidad, Date fecha) {
        this.idMovimiento = idMovimiento;
        this.tipo = tipo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "idMovimiento=" + idMovimiento +
                ", tipo='" + tipo + '\'' +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                '}';
    }
}
