import java.util.Scanner;

public class ejerciciosMetodos {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba un numero: ");
        int n = teclado.nextInt();
        tablaDeMultiplicar(n);
        int[] valores = {10, 23, 34, 50, 67, 98};
        
        double promedioResultado = promedio(valores);
        System.out.println("El promedio es: " + promedioResultado);


    }
    public static void tablaDeMultiplicar(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }

    public static double promedio(int[] valores) {
        Double suma = 0.0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma / valores.length;
    }
}

/*

"tablaDeMultiplicar" es un PROCEDIMIENT: realiza una accion (imprimir en pantalla) y no retorna ningun valor (es de tipo void).

"promedio" es una FUNCION: realiza un calculo y RETORNA un valor de tipo "Double"

En JAVA la distincion no existe a nivel sintactico porque el lenguaje no utiliza palabras clave separadas (como "procedure" o "function en otros lenguajes").
En JAVA todo se define bajo el concepto unificado de "METODO".
La unica diferencia a nivel codigo es si se especifica "void" (no devuelve dato) o un tipo de datos explicito como "double", "int", etc. (si devuelve dato).
 
 */
