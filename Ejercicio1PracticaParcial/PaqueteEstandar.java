package Ejercicio1PracticaParcial;

public class PaqueteEstandar extends Paquete{

    private int diasEstimados;

    public PaqueteEstandar(int diasEstimados, String codigoTrack, double pesoKg, String destino){
        super(codigoTrack, pesoKg, destino);
        this.diasEstimados = diasEstimados;
    }

    @Override
    public double calcularCostoEnvio(){
        return 1000 * getPesoKg();
    }

    @Override
    public boolean esAptoParaEnvioAereo(){
        return getPesoKg() <= 15.0;
    }

    @Override
    public String obtenerDetalle(){
        return "Codigo: " + getCodigoTrack() + ", Destino: " + getDestino() + ", Peso: " + getPesoKg() + ", Dias estimados: " + diasEstimados;
    }

}
