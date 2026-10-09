package Ejercicio2PracticaParcial;

public class salaReuniones extends espacioGenerico {
    private double costoLimpieza;
    private boolean proyector;

    public salaReuniones(double costoLimpieza, boolean proyector, String id, int capacidadMaxPersonas, double precioBaseXPersona){
        super(id, capacidadMaxPersonas, precioBaseXPersona);
        this.costoLimpieza = costoLimpieza;
        this.proyector = proyector;
    }

    @Override
    public double costoTotalReserva(int horas) {
        return (getPrecioBaseXPersona() * horas) + costoLimpieza;
    }

    @Override
    public boolean disponibilidadEspacio() {
        return !(proyector && costoLimpieza == 0);
    }


}
