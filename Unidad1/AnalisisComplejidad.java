public class AnalisisComplejidad {

    //BUSQUEDA SECUENCIAL: O(n) en el peor caso
    public static int busquedaSecuencial(int[] arreglo, int objetivo){
        for(int i = 0; i < arreglo.length; i++ ){
            if (arreglo[i] == objetivo) return i;
        }
        return -1;
    }

    //BUSQUEDA BINARIA: O(log n), requiere el arreglo ordenado
    public static int busquedaBinaria(int[] arreglo, int objetivo){
        int inicio = 0, fin = arreglo.length - 1;
        while (inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            if (arreglo[medio] == objetivo) return medio;
            if (arreglo[medio] < objetivo) inicio = medio + 1;
            else fin = medio - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int n = 5_000_000;
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) arreglo[i] = i; // arreglo ordenado: 0, 1, 2, ..., n-1

        int objetivo = n - 1; // peor caso para la secuencial: el ultimo elemento

        long inicio1 = System.nanoTime();
        busquedaSecuencial(arreglo, objetivo);
        long tiempoSecuencial = System.nanoTime() - inicio1;

        long inicio2 = System.nanoTime();
        busquedaBinaria(arreglo, objetivo);
        long tiempoBinaria = System.nanoTime() - inicio2;

        System.out.println("Tamaño del arreglo: " + n);
        System.out.println("Busqueda secuencial O(n): " + tiempoSecuencial + " ns");
        System.out.println("Tamaño binaria O(log n): " + tiempoBinaria + " ns");

    }


}
