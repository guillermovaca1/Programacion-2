import java.time.LocalDate;

class Reserva {
    private String nombreHuesped;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    public Reserva(String nombreHuesped, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.nombreHuesped = nombreHuesped;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva de " + nombreHuesped + " en habitación " + habitacion.getNumero() +
                " del " + fechaEntrada + " al " + fechaSalida;
    }
}
