package Ejercicio1PracticaParcial;

public class PaqueteFragil extends Paquete {

    private String nivelProteccion;

    public PaqueteFragil(String nivelProteccion, String codigoTrack, double pesoKg, String destino){
        super(codigoTrack, pesoKg, destino);
        setNivelProteccion(nivelProteccion);
    }

    public void setNivelProteccion(String nivelProteccion) {
        if(nivelProteccion.equals("Baja") || nivelProteccion.equals("Media") || nivelProteccion.equals("Alta")){
            this.nivelProteccion = nivelProteccion;
        }else {
            throw new IllegalArgumentException("Nivel invalido.");
        }

    }

    public String getNivelProteccion() {
        return nivelProteccion;
    }

    @Override
    public double calcularCostoEnvio(){
        if (nivelProteccion.equals("Alta")){
            return (1000 * getPesoKg()) * 1.30;
        } else if (nivelProteccion.equals("Media")) {
            return (1000 * getPesoKg()) * 1.15;
        }else {
            return 1000 * getPesoKg();
        }
    }

    @Override
    public boolean esAptoParaEnvioAereo(){
        return false;
    }

    @Override
    public String obtenerDetalle(){
        return "Codigo: " + getCodigoTrack() + ", Destino: " + getDestino() + ", Peso: " + getPesoKg() + ", Nivel de Proteccion: " + nivelProteccion;
    }

}
