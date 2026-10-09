package Ejercicio1PracticaParcial.app;

import Ejercicio1PracticaParcial.Paquete;
import Ejercicio1PracticaParcial.PaqueteEstandar;
import Ejercicio1PracticaParcial.PaqueteFragil;

public class Main {

    public static void main(String[] args) {

        Centrologistico PediloYa = new Centrologistico();

        PaqueteEstandar zapas = new PaqueteEstandar(5, "ABC123", 5, "Resistencia");
        PediloYa.registrarPaquete(zapas);

        PaqueteEstandar remera = new PaqueteEstandar(3, "SDC421", 2, "Cordoba");
        PediloYa.registrarPaquete(remera);

        PaqueteFragil mando = new PaqueteFragil("Baja", "ddd222", 2, "Lanus");
        PediloYa.registrarPaquete(mando);

        PaqueteFragil ps5 = new PaqueteFragil("Alta", "zzd1", 6, "Lanus");
        PediloYa.registrarPaquete(ps5);

        zapas.actualizarDestino("Rosario");
        remera.actualizarDestino("Mendoza", true);

        System.out.println(zapas.getDestino());
        System.out.println(remera.getDestino());

        mando.actualizarDestino("Barranqueras", false);
        System.out.println(mando.getDestino());

        try {
            PaqueteEstandar tele = new PaqueteEstandar(2, "aas33", -3, "España");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        PediloYa.mostrarReporteEnvios();
        System.out.println("Recaudacion total: " + PediloYa.calcularRecaudacionTotal());
    }
}
