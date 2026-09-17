import java.util.Arrays;
import java.util.Scanner;

public class EjercicioIntegradorUnidad1 {

    //RECURSIVIDAD: suma de los digitos de un numero entero positivo (ver paso 5.4)
    public static int sumarDigitos(int numero){
        if(numero < 10){
            return numero;
        }
        return (numero % 10) + sumarDigitos(numero / 10);
    }

    //RECURSIVO: busqueda binaria sobre un arreglo ya ordenado - O(log n)
    public static int busquedaBinariaRecursiva(int[] arreglo, int objetivo, int inicio, int fin){
        if(inicio > fin){
            return -1;// caso base: rango vacio, no esta
        }
        int medio = inicio + (fin - inicio) / 2;
        if (arreglo[medio] == objetivo){
            return medio; // caso base: encontrado
        }
        if (objetivo < arreglo[medio]){
            return busquedaBinariaRecursiva(arreglo, objetivo, inicio, medio - 1);
        }else {
            return busquedaBinariaRecursiva(arreglo, objetivo, medio + 1, fin);
        }
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== UTN FRRE - Programacion II: Ejercicio Integrador Unidad 1 ===");

        //MODULO A: suma recursiva de digitos
        System.out.println("Ingrese un numero entero positivo: ");
        int numeroIngreaso = teclado.nextInt();
        System.out.println("-> La suma de sus digitos es: " + sumarDigitos(numeroIngreaso));

        //MODULO B: busqueda binaria recursiva
        int[] datos = {88, 12, 45, 3, 90, 23, 67, 50};
        System.out.println("\nArreglo ordenado: " + Arrays.toString(datos));

        Arrays.sort(datos); // requisito indispensable para busqueda binaria
        System.out.println("Arreglo ordenado: " + Arrays.toString(datos));

        System.out.print("Ingrese el valor que desea buscar: ");
        int objetivo = teclado.nextInt();
        int posicion = busquedaBinariaRecursiva(datos, objetivo, 0, datos.length - 1);

        if (posicion != -1){
            System.out.println("Encontrado en el indice: " + posicion);
        }else{
            System.out.println("El valor " + objetivo + " no esta en el arreglo. ");
        }
        teclado.close();
    }

}
