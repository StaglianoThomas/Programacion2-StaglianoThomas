public class Recursividad {

    // 5.1 Factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 5.2 Cuenta regresiva
    public static void cuentaRegresiva(int n) {
        if (n <= 0) {
            System.out.println("¡Despegue!");
            return;
        }
        System.out.println("Apilando llamada -> n = " + n);
        cuentaRegresiva(n - 1);
        System.out.println("Desapilando llamada -> n = " + n);
    }

    // 5.3 Suma hasta N
    public static int sumaHastaN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumaHastaN(n - 1);
    }

    // 5.4 Suma de dígitos
    public static int sumarDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        return (numero % 10) + sumarDigitos(numero / 10);
    }

    // 5.5 Potencia rápida
    public static long potenciaRapida(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        long mitad = potenciaRapida(base, exponente / 2);
        if (exponente % 2 == 0) {
            return mitad * mitad;
        } else {
            return mitad * mitad * base;
        }
    }

    // 5.6 Fibonacci recursivo e iterativo
    public static long fibonacciRecursivo(int n) {
        if (n <= 1) return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static long fibonacciIterativo(int n) {
        if (n <= 1) return n;
        long anterior = 0, actual = 1;
        for (int i = 2; i <= n; i++) {
            long siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
        return actual;
    }

    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));

        System.out.println("\ncuentaRegresiva(3):");
        cuentaRegresiva(3);

        System.out.println("\nsumaHastaN(4) = " + sumaHastaN(4));

        System.out.println("sumarDigitos(432) = " + sumarDigitos(432));

        System.out.println("potenciaRapida(2, 10) = " + potenciaRapida(2, 10));

        int n = 35;
        long inicioRec = System.nanoTime();
        long resultadoRec = fibonacciRecursivo(n);
        long tiempoRec = System.nanoTime() - inicioRec;

        long inicioIter = System.nanoTime();
        long resultadoIter = fibonacciIterativo(n);
        long tiempoIter = System.nanoTime() - inicioIter;

        System.out.printf("Fibonacci recursivo O(2^n): %d en %d ns%n", resultadoRec, tiempoRec);
        System.out.printf("Fibonacci iterativo O(n): %d en %d ns%n", resultadoIter, tiempoIter);
    }
}
