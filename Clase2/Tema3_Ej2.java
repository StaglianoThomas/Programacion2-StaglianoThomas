public class Ejercicio2TEMA3 {
    public static void main(String[] args){
        int base = 2;
        int exponente = 8;
        
        System.out.println(potencia(base, exponente));
        System.out.println(potenciaIterativa(base, exponente));

    }
    public static long potencia(int base, int exponente){
        if (exponente == 0){
            return 1; // caso base
        }
        return base * potencia(base, exponente - 1);
    }

    public static long potenciaIterativa(int base, int exponente){
        long acum = 1;
        for(int i = 0; i < exponente; i++){
            acum = acum * base;
        }
        return acum;

    }
  /*

  La version ITERATIVA conviene mas para exponente grandes.
  La RECURSIVA apila una llamada dentro de otra (cada llamada espera a la siguiente), ocupando
  espacio en la pila de llamadas.
  Con exponentes muy grandes, esto puede agotar esa pila y tirar un StackOverFlowError.
  La ITERATIVA, usa una sola variable acumuladora dentro de un for, si apilar llamadas,
  por lo que es mas eficiente en memoria y no tiene ese riesgo.
  
  */
}
