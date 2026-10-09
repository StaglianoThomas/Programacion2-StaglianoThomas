package Ejercicio2PracticaParcial;

public class escritorioIndividual extends espacioGenerico {

    private boolean monitorExtra;

    public escritorioIndividual(boolean monitorExtra, String id, int capacidadMaxPersonas, double precioBaseXPersona) {
        super(id, capacidadMaxPersonas, precioBaseXPersona);
        this.monitorExtra = monitorExtra;
    }

    public double costoXHora() {
        if (monitorExtra) {
            return getPrecioBaseXPersona() * 1.15;
        } else {
            return getPrecioBaseXPersona();
        }
    }

    @Override
    public double costoTotalReserva(int horas) {
        return  costoXHora() * horas;
    }

    @Override
    public boolean disponibilidadEspacio() {
        return true;
    }
}
