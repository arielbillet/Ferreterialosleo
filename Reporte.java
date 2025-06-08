import java.util.Date;

public class Reporte {
    private int idReporte;
    private String tipo;
    private Date fecha;
    private Administrador admin;

    public Reporte(int idReporte, String tipo, Date fecha, Administrador admin) {
        this.idReporte = idReporte;
        this.tipo = tipo;
        this.fecha = fecha;
        this.admin = admin;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "idReporte=" + idReporte +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", admin=" + admin +
                '}';
    }
}
