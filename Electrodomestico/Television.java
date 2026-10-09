package Electrodomestico;

public class Television extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public static final double RESOLUCION_DEFAULT = 20;
    public static final boolean TDT_DEFAULT = false;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = TDT_DEFAULT;
    }

    public Television(double precioBase, double pesoKg) {
        super(precioBase, pesoKg);
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = TDT_DEFAULT;
    }

    public Television(double resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double pesoKg) {
        super(precioBase, color, consumoEnergetico, pesoKg);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio += precio * 0.30;
        }
        if (sintonizadorTDT) {
            precio += 50;
        }
        return precio;
    }
}
