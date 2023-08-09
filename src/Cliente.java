public class Cliente {
    private String nombre;
    private String cedula;
    private String empresa;

    public Cliente(String nombre, String cedula, String empresa) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " (Cédula: " + cedula + ")";
    }
}
