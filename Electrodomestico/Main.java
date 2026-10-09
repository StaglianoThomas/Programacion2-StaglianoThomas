package Electrodomestico;

public class Main {

    public static void main(String[] args) {
        Electrodomestico[] lista = new Electrodomestico[10];

        lista[0] = new Electrodomestico(200, "Negro", 'A', 30);
        lista[1] = new Electrodomestico(150, "rojo", 'C', 60);
        lista[2] = new Lavarropas(40, 300, "Blanco", 'B', 70);
        lista[3] = new Lavarropas(8, 250, "Gris", 'D', 45);
        lista[4] = new Lavarropas();
        lista[5] = new Television(50, true, 500, "Negro", 'A', 15);
        lista[6] = new Television(32, false, 350, "Azul", 'E', 10);
        lista[7] = new Television(55, true, 800, "Gris", 'B', 25);
        lista[8] = new Television();
        lista[9] = new Electrodomestico();

        double sumaElectrodomesticos = 0;
        double sumaLavarropas = 0;
        double sumaTelevisiones = 0;

        for (Electrodomestico e : lista) {
            double precio = e.precioFinal();

            if (e instanceof Lavarropas) {
                sumaLavarropas += precio;
            } else if (e instanceof Television) {
                sumaTelevisiones += precio;
            }
            sumaElectrodomesticos += precio;
        }

        System.out.println("Suma lavarropas: $" + sumaLavarropas);
        System.out.println("Suma televisiones: $" + sumaTelevisiones);
        System.out.println("Suma total electrodomésticos: $" + sumaElectrodomesticos);
    }
}
