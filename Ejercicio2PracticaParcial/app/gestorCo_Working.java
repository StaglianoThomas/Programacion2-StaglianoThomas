package Ejercicio2PracticaParcial.app;

import Ejercicio2PracticaParcial.Contrato;

import java.util.ArrayList;

public class gestorCo_Working {

    private ArrayList<Contrato> espacios = new ArrayList<>();

    public void registrarEspacio(Contrato espacio){
        espacios.add(espacio);
    }

    public void mostrarReportes(int horas){
        for (Contrato e : espacios){
            System.out.println(e);
            System.out.println("Disponible: " + e.disponibilidadEspacio());
            System.out.println("Costo por " + horas + " horas: " + e.costoTotalReserva(horas));
        }
    }

    public double calcularTotal(int horas){
        double total = 0;
        for (Contrato e : espacios){
            total += e.costoTotalReserva(horas);
        }
        return total;
    }
}
