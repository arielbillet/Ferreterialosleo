public class Administrador {
    private String nombre;
    private String usuario;
    private String contrasenia;

    // Constructor
    public Administrador(String nombre, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    // Método para iniciar sesión
    public boolean login(String usuario, String contrasenia) {
        return this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // Método para mostrar información del administrador
    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + nombre + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
