public class Ejercicio1TEMA2 {

    public static void main(String[] args){

        int x = 1;
        int y = 2;
        System.out.println("Primer valor: " + x);
        System.out.println("Segundo valor: " + y);
        intercambiar(x,y);
        System.out.println("Primer valor: " + x);
        System.out.println("Segundo valor: " + y);

        /*
        
        No cambian porque el metodo intercambiar() recibe COPIAS
        de "x" e "y" (a y b), no las variables originales. El intercambio
        entre a y b, dentro del metodo, y nunca toca a "x" e "y" del main.
        Esto se llama "paso por valor": Java copia el valor, no la variable.
        
        */
    }

    public static void intercambiar(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
