import java.util.Arrays;

public class Ejercicio2TEMA2 {
    public static void main(String[] args) {

        int[] valores = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(valores));
        duplicarValores(valores);
        System.out.println(Arrays.toString(valores));
        /*
        
        DIFERENCIA CON EL EJERCICIO 1:
        
        Lo que se copia exactamente al pasar el arreglo como parámetro es la
        dirección (referencia) del arreglo, no los elementos.
        Por eso, modificar una posición (arr[i] = ...) afecta al contenido
        real, que ya se ve reflejado en main.
        Pero si el metodo hiciera arr = new int[5], solo cambiaria su propia
        copia de la dirección, no afectaría al arreglo de main.
        
        */
    }
    public static void duplicarValores(int[] arr){
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = arr[i] * 2;
        }
    }
}
