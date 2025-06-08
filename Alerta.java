import java.util.Date;

public class Alerta {
    private int idAlerta;
    private Producto producto;
    private Date fecha;
    private String estado;

    public Alerta(int idAlerta, Producto producto, Date fecha, String estado) {
        this.idAlerta = idAlerta;
        this.producto = producto;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alerta{" +
                "idAlerta=" + idAlerta +
                ", producto=" + producto +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                '}';
    }
}
