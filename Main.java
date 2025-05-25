import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(new Habitacion(101, "simple"));
        hotel.agregarHabitacion(new Habitacion(102, "doble"));
        hotel.agregarHabitacion(new Habitacion(103, "suite"));
        hotel.agregarHabitacion(new Habitacion(104, "simple"));

        System.out.println("📋 Habitaciones actuales:");
        hotel.mostrarHabitaciones();

        // Crear una reserva
        System.out.println("\n🔑 Intentando crear una reserva:");
        hotel.crearReserva("Juan Pérez", "simple",
                LocalDate.of(2025, 6, 1),
                LocalDate.of(2025, 6, 5));

        // Consultar disponibilidad para otro tipo
        System.out.println("\n🔍 Consultando disponibilidad para 'suite':");
        Habitacion h = hotel.consultarDisponibilidad("suite");
        if (h != null) {
            System.out.println("Disponible: " + h);
        } else {
            System.out.println("No hay suites disponibles.");
        }

        // Mostrar reservas registradas
        System.out.println("\n📖 Reservas registradas:");
        hotel.mostrarReservas();

        // Mostrar estado actualizado de habitaciones
        System.out.println("\n🏨 Estado actual de habitaciones:");
        hotel.mostrarHabitaciones();
    }
}