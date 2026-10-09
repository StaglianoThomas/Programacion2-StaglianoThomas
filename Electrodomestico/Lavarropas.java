package Electrodomestico;

public class Lavarropas extends Electrodomestico{

    private double carga;

    public static final double CARGA_DEFAULT = 5;

    public Lavarropas(){
        super();
        pesoKg = PESO_KG_DEFAULT;
    }

    public Lavarropas(double precioBase, double pesoKg){
        super(precioBase, pesoKg);
        this.carga = CARGA_DEFAULT;
    }

    public Lavarropas(double carga, double precioBase, String color, char consumoEnergetico, double pesoKg){
        super(precioBase, color, consumoEnergetico, pesoKg);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30){
            precio += 50;
        }
        return precio;
    }
}
