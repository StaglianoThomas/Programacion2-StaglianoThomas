/*
Tema 1: Lista estática sobre arreglo.
Ejercicio 1 y 2.
*/

class ListaEstatica {

    private int cantidad;
    private int[] datos;

    public ListaEstatica(int datos){
        this.datos = new int[datos];
        cantidad = 0;
    }

    public void insertar(int valor){
        if (cantidad == datos.length){
            throw new IllegalArgumentException("La lista esta llena.");
        }
        datos[cantidad] = valor;
        cantidad++;
    }

    public int buscar(int valor){
        for (int i = 0; i < cantidad; i++){
            if (datos[i] == valor){
                return i;
            }
        }
        return -1;
    }

    public void mostrar(){
        for (int i = 0; i < cantidad; i++){
            System.out.println(datos[i]);
        }
    }

    public void insertarEnPosicion(int indice, int valor){
        if (cantidad == datos.length){
            throw new IllegalArgumentException("La lista esta llena.");
        }
        if (indice < 0 || indice > cantidad){
            throw new IllegalArgumentException("Indice fuera de rango.");
        }

        for (int i = cantidad; i > indice; i--){
            datos[i] = datos[i - 1];
        }

        datos[indice] = valor;
        cantidad++;
    }

    public void eliminarEnPosicion(int indice){
        if (indice < 0 || indice >= cantidad){
            throw new IllegalArgumentException("Indice fuera de rango.");
        }

        for (int i = indice; i < cantidad - 1; i++){
            datos[i] = datos[i + 1];
        }

        cantidad--;
    }
}


public class Main {
    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica(5);

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.insertar(40);

        System.out.println("Indice del 30: " + lista.buscar(30));
        System.out.println("Indice del 67: " + lista.buscar(67));

        lista.insertarEnPosicion(1, 15);
        lista.eliminarEnPosicion(3);

        System.out.println("--- Lista final ---");
        lista.mostrar();
    }
}
