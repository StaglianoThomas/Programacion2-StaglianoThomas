public class ComparadorRendimiento {
    //VERSION A: recorre los n numeros uno por uno y los va acumulando
    public static long sumaConBucle(int n){
        long suma =0;
        for(int i = 1; i <= n ; i++){
            suma += i;
        }
        return suma;
    }

    //VERSION B: formula de Gauss - siempre hace la misma cantidad de cuentas
    public static long sumaConFormula(int n){
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args){
        int n = 1_000_000_000; // mil millones

        long inicioBucle = System.nanoTime();
        long resultadoBucle = sumaConBucle(n);
        long tiempoBucle = System.nanoTime() - inicioBucle;

        long inicioFormula = System.nanoTime();
        long resultadoFormula = sumaConFormula(n);
        long tiempoFormula = System.nanoTime() - inicioFormula;

        System.out.println("Resultado con bucle: " + resultadoBucle + " (" + tiempoBucle + " ns)");
            System.out.println("Resultado con formula: " + resultadoFormula + " (" + tiempoFormula + " ns)");

    }

}
