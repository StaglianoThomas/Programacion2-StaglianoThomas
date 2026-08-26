public class SubprogramasBasicos {
    // PROCEDIMIENTO: ejecuta una accion y no retorna valor (void)
    public static void mostrarBienvenida(String nombre){
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Programacion II.");
    }

    //FUNCION: procesa datos y retorna un valor de un tipo especifico (double)
    public static double calcularPromedio(double nota1, double nota2, double nota3){
        double suma = nota1 + nota2 + nota3;
            return suma / 3.0;
    }

    public static void main(String[] args){
        //Invocacion del procedimiento
        mostrarBienvenida("Stagliano Thomas");

        //Invocacion de la funcion, guardando el retorno en una variable
        double nota1 = 7.5, nota2 = 8.0, nota3 = 9.5;
        double promedioFinal = calcularPromedio(nota1, nota2, nota3);
        System.out.printf("El promedio de las notas es: %.2f%n", promedioFinal);
    }

}
