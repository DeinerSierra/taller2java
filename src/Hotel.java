import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, int cantidadHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();

        for (int i = 1; i <= cantidadHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.estaDisponible()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }

    public void realizarReserva(Cliente cliente, Habitacion habitacion) {
        habitacion.reservar(cliente);
    }

    public void cancelarReserva(Habitacion habitacion) {
        habitacion.desocupar();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel: ").append(nombre).append("\n");
        for (Habitacion habitacion : habitaciones) {
            sb.append(habitacion.toString()).append("\n");
        }
        return sb.toString();
    }
}
