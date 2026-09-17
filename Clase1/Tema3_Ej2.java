import java.util.Scanner;

public class verificadorPrimo {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba un numero entero: ");
        int n = teclado.nextInt();
        esPrimo(n);

    }

    public static void esPrimo(int n){
        if (n < 0){
            System.out.println("Error: No se aceptan numeros negativos");
        }else{
            if (n == 0 || n == 1){
                System.out.println("No es Primo");
            } else if (n == 2) {
                System.out.println("Es Primo");
            }else {
                if (n % 2 == 0){
                    System.out.println("No es Primo");
                }else{
                    System.out.println("Es Primo");
                }
            }
            {

            }
        }

    }

}
