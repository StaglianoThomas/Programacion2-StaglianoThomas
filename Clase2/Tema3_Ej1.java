public class Ejercicio1TEMA3 {

    public static void main(String[] args){
        int n = 1234;
        System.out.println(sumarDigitos(n));

    }


    public static int sumarDigitos(int n){
        if (n == 0) {
            return 0; // caso base
        }
        return (n % 10) + sumarDigitos(n / 10); // caso recursivo

    }
}
