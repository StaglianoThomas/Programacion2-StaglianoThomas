import java.util.Arrays;

public class MemoriaYReferencias {

    //MODIFICA UN ELEMENTO DEL ARREGLO: el cambio impacta en el Heap compartido
    public static void modificarArreglo(int[] vector){
        System.out.println("[Dentro del metodo] Modificando el indice 0...");
            vector[0] = 999;
    }

    //REASIGNA LA REFERENCIA LOCAL A UN ARREGLO NUEVO: NO afecta a la varaible original
    public static void reasignarReferencia(int[] vector){
        System.out.println("[Dentro del metodo] Apuntado la copia local a otro arreglo...");
            vector = new int[]{7, 8 ,9};
            System.out.println("[Dentro del metodo] Vector local ahora: " + Arrays.toString(vector));
    }

    public static void main(String[] args){
        int[] misDatos = {10, 20, 30};
        System.out.println("1. Arreglo original: " + Arrays.toString(misDatos));
            modificarArreglo(misDatos);
            System.out.println("2. Luego de modificarArreglo: " + Arrays.toString(misDatos));

            reasignarReferencia(misDatos);
            System.out.println("3. Luego de reasignarReferncia: " + Arrays.toString(misDatos));
    }

}

