import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        for (Habitacion h : habitaciones) {
            System.out.println(h);
        }
    }

    public void mostrarReservas() {
        for (Reserva r : reservas) {
            System.out.println(r);
        }
    }

    public Habitacion consultarDisponibilidad(String tipoDeseado) {
        for (Habitacion h : habitaciones) {
            if (h.getTipo().equalsIgnoreCase(tipoDeseado) && h.estaDisponible()) {
                return h;
            }
        }
        return null;
    }

    public boolean crearReserva(String nombreHuesped, String tipoHabitacion,
                                LocalDate entrada, LocalDate salida) {
        Habitacion disponible = consultarDisponibilidad(tipoHabitacion);
        if (disponible != null) {
            disponible.ocupar();
            Reserva reserva = new Reserva(nombreHuesped, disponible, entrada, salida);
            reservas.add(reserva);
            System.out.println("Reserva creada con éxito:");
            System.out.println(reserva);
            return true;
        } else {
            System.out.println("No hay habitaciones disponibles del tipo solicitado.");
            return false;
        }
    }
}