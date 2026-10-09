package Ejercicio2PracticaParcial.app;

import Ejercicio2PracticaParcial.escritorioIndividual;
import Ejercicio2PracticaParcial.salaReuniones;

public class Main {

    public static void main(String[] args) {

        gestorCo_Working gestor = new gestorCo_Working();

        escritorioIndividual e1 = new escritorioIndividual(true,"ax12", 10, 500);
        escritorioIndividual e2 = new escritorioIndividual(false,"dc34", 15, 600);

        salaReuniones s1 = new salaReuniones(150,true, "mn10", 20, 700);
        salaReuniones s2 = new salaReuniones(200,false, "zzz5", 25, 750);

        gestor.registrarEspacio(e1);
        gestor.registrarEspacio(e2);
        gestor.registrarEspacio(s1);
        gestor.registrarEspacio(s2);

        e1.actualizarCapEspacio(2);
        s1.actualizarCapEspacio(12, true);

        try {
            escritorioIndividual malo = new escritorioIndividual(false, "", -5, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error capturado: " + ex.getMessage());
        }

        gestor.mostrarReportes(4);
        System.out.println("Total a recaudar (4 hs): " + gestor.calcularTotal(4));
    }

}



