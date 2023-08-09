import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservarHotel {
    private Map<Hotel, List<Habitacion>> reservas;

    public ReservarHotel() {
        this.reservas = new HashMap<>();
    }

    public void realizarReserva(Hotel hotel, Cliente cliente, Habitacion habitacion) {
        hotel.realizarReserva(cliente, habitacion);
        if (!reservas.containsKey(hotel)) {
            reservas.put(hotel, new ArrayList<>());
        }
        reservas.get(hotel).add(habitacion);
    }

    public void cancelarReserva(Hotel hotel, Habitacion habitacion) {
        hotel.cancelarReserva(habitacion);
        if (reservas.containsKey(hotel)) {
            reservas.get(hotel).remove(habitacion);
        }
    }

    public void mostrarInformacionReservas() {
        for (Map.Entry<Hotel, List<Habitacion>> entry : reservas.entrySet()) {
            Hotel hotel = entry.getKey();
            List<Habitacion> habitacionesReservadas = entry.getValue();
            System.out.println("Hotel: " + hotel.getNombre());
            for (Habitacion habitacion : habitacionesReservadas) {
                if (habitacion.getOcupante() != null) {
                    System.out.println("  Habitación " + habitacion.getNumero() + ": " + habitacion.getOcupante().getNombre() + " (Cédula: " + habitacion.getOcupante().getCedula() + ")");
                }
            }
        }
    }
}
