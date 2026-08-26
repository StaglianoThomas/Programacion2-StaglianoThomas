public class AmbitoYPrimitivos {
    //VARIABLE DE CLASE: visible en toda la clase, no depende de ningun metodo
    public static int contadorGlobal = 100;

    public static void intentarModificarPrimitivo(int numero){
        System.out.println("[Dentro del metodo] Recibido: " + numero);
        numero = numero + 500; //Modifica solo la copia local
        System.out.println("[Dentro del metodo] Modificado a: " + numero);

    }

    public static void main(String[] args){
        int miNumero = 10;
        System.out.println("1. Antes de llamar al metodo: miNumero = " + miNumero);

        intentarModificarPrimitivo(miNumero); // se envia una COPIA del valor 10

        System.out.println("2. Despues de llamar al metodo: miNumero = " + miNumero);
        System.out.println("(el valor original no cambia)");
        System.out.println("3. Variable de clase accesible desde cualquier metodo: " + contadorGlobal);
    }
}
