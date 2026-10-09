package Ejercicio2PracticaParcial;

public abstract class espacioGenerico implements Contrato {

    private String id;
    private int capacidadMaxPersonas;
    private double precioBaseXPersona;

    public espacioGenerico(String id, int capacidadMaxPersonas, double precioBaseXPersona){
        setId(id);
        setCapacidadMaxPersonas(capacidadMaxPersonas);
        setPrecioBaseXPersona(precioBaseXPersona);
    }

    public void setId(String id) {
        if (id == null || id.isEmpty()){
            throw new IllegalArgumentException("Identificador invalido.");
        }else{
            this.id = id;
        }
    }

    public String getId() {
        return id;
    }

    public void setCapacidadMaxPersonas(int capacidadMaxPersonas) {
        if (capacidadMaxPersonas > 0){
            this.capacidadMaxPersonas = capacidadMaxPersonas;
        }else {
            throw new IllegalArgumentException("La capacidad debe ser mayor a 0.");
        }
    }

    public int getCapacidadMaxPersonas() {
        return capacidadMaxPersonas;
    }

    public void setPrecioBaseXPersona(double precioBaseXPersona) {
        if (precioBaseXPersona > 0){
            this.precioBaseXPersona = precioBaseXPersona;
        }else {
            throw new IllegalArgumentException("El precio base debe ser mayor a 0.");        }
    }

    public double getPrecioBaseXPersona() {
        return precioBaseXPersona;
    }

    public void actualizarCapEspacio(int nuevaCapacidad){
        setCapacidadMaxPersonas(nuevaCapacidad);
    }

    public void actualizarCapEspacio(int nuevaCapacidad, boolean mobiliario){
        if (mobiliario){
            this.id = this.id + " [Mobiliario Especial]";
        }
    }

    @Override
    public String toString() {
        return id + " | Capacidad: " + capacidadMaxPersonas + " | Precio base: " + precioBaseXPersona;
    }
}

