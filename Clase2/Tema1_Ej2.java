/*

IDENTIFICACION DEL ERROR DE AMBITO.
"resultado" se declara dos veces:
- Una vez afuera del if.
- Otra vez adentro del if, con "int resultado = x * 2;"

Esa segunda variable es una variable nuevva y distinta, que solo existe dentro de las llaves {} del if.
Cuando el if termina, esa variable "muere". Por eso System.out.println(resultado) de afuera no tiene ningun
valor asignado y Java tira error de compilacion.

*/

//CORRECCION

public class Ejercicio2T1C2 {
    public static void main(String[] args) {

        int x = 5; // esto hace falta, porque x no existía
        int resultado = 0;
        if (x > 0){
            resultado = x * 2; // no se vuelve a declarar con "int"
        }
        System.out.println(resultado);
    }

    //METODO CON SHADOWING

    int valor = 10; //atributo de la clase

    public void mostrar(int valor){

    /*
    
    Dentro de este metodo, "valor" se refiere al PARAMETRO, no al atributo de la clase.
    Esto pasa porque el parametro esta en un ambito mas cercano (el del metodo) y "tapa"
    (hace shadowing) al atributo, que queda en un ambiyo mas lejano (el de la clase).
    Para acceder al atributo de la clase habria que usar "this.valor"
    
    */
        System.out.println(valor);
    }
}


  

