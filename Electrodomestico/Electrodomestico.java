package Electrodomestico;

public class Electrodomestico {

    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double pesoKg;

    public static final double PRECIO_BASE_DEFAULT = 100.00;
    public static final String  COLOR_DEFAULT = "Blanco";
    public static final char CONSUMO_DEFAULT = 'F';
    public static final double PESO_KG_DEFAULT = 5;

    public static final String[] COLORES = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

    public Electrodomestico(){
      this(PRECIO_BASE_DEFAULT, COLOR_DEFAULT, CONSUMO_DEFAULT, PESO_KG_DEFAULT);
    }

    public Electrodomestico(double precioBase, double pesoKg){
        this(precioBase, COLOR_DEFAULT, CONSUMO_DEFAULT, pesoKg);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double pesoKg){
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.pesoKg = pesoKg;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public String getColor() {
        return color;
    }

    public char comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F'){
            return letra;
        }
        return CONSUMO_DEFAULT;
    }

    public String comprobarColor(String color){
        for (String c: COLORES){
            if (c.equalsIgnoreCase(color)){
                return c;
            }
        }
        return COLOR_DEFAULT;
    }

    public double precioFinal(){

        double precio = precioBase;
        switch (consumoEnergetico){
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
        }

        if (pesoKg < 20){
            precio += 10;
        } else if (pesoKg < 50) {
            precio += 50;
        } else if (pesoKg < 80) {
            precio += 80;
        } else if (pesoKg >= 80) {
            precio += 100;
        }
        return precio;
    }
}

