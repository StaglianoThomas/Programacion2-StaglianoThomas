package Ejercicio1PracticaParcial;

public abstract class Paquete implements Enviable {
    private String codigoTrack;
    private double pesoKg;
    private String destino;

    public Paquete(String codigoTrack, double pesoKg, String destino) {
        setPesoKg(pesoKg);
        setCodigoTrack(codigoTrack);
        this.destino = destino;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg > 0){
            this.pesoKg = pesoKg;
        }else {
            throw new IllegalArgumentException("Peso invalido");
        }
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setCodigoTrack(String codigoTrack) {
        if (codigoTrack == null || codigoTrack.isEmpty()){
            throw new IllegalArgumentException("Codigo invalido.");
        }else {
            this.codigoTrack = codigoTrack;
        }
    }

    public String getCodigoTrack() {
        return codigoTrack;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void actualizarDestino(String nuevoDestino) {
        setDestino(nuevoDestino);
    }

    public void actualizarDestino(String nuevoDestino, boolean express){
        if (express){
            setDestino(nuevoDestino + " [PRIORITARIO]");
        }else {
            setDestino(nuevoDestino);
        }
    }

    public abstract String obtenerDetalle();
}