public class Habitacion {
    private int numero;
    private boolean disponible;
    private Cliente huesped;
    public Habitacion(int numero) {
        this.numero = numero;
        this.disponible = true;
        this.huesped = null;
    }
    public int getNumero() {
        return numero;
    }

    public boolean estaDisponible() {
        return disponible;
    }
    public void reservar(Cliente cliente) {
        disponible = false;
        huesped = cliente;
    }
    public void desocupar() {
        disponible = true;
        huesped = null;
    }
    public Cliente getOcupante() {
        return huesped;
    }
    @Override
    public String toString() {
        if (huesped != null) {
            return "Habitación " + numero + " (Ocupada por: " + huesped.getNombre() + ")";
        } else {
            return "Habitación " + numero + " (Disponible)";
        }
    }
}
