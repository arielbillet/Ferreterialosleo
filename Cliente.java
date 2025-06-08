public class Cliente {
    // Atributos privados
    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String dni, String telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para mostrar información legible del cliente
    @Override
    public String toString() {
        return "Cliente: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono + ", Dirección: " + direccion;
    }
} 
