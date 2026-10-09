package Ejercicio1PracticaParcial.app;

import Ejercicio1PracticaParcial.Enviable;
import Ejercicio1PracticaParcial.Paquete;

import java.util.ArrayList;

public class Centrologistico {

    private ArrayList<Enviable> inventario;

    public Centrologistico(){
        inventario = new  ArrayList<>();
    }

    public void registrarPaquete(Enviable e){
        inventario.add(e);
    }

    public void mostrarReporteEnvios() {
        for (Enviable e: inventario ){
            if (e instanceof Paquete){
                System.out.println(((Paquete) e).obtenerDetalle());
                System.out.println("Costo de envio: " + e.calcularCostoEnvio());
            }
        }
    }

    public double calcularRecaudacionTotal(){
        double total = 0;
        for (Enviable e: inventario){
            total = total + e.calcularCostoEnvio();
        }
        return total;
    }

}
