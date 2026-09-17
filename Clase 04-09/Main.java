import java.time.LocalDate;
import java.time.Period;


public class Main {

    public static void main(String[] args) {

        LocalDate nacimiento = LocalDate.of(2004, 9, 24);
        Persona p1 = new Persona("Thomas", "Stagliano", nacimiento,100 );
        String mensaje = p1.Saludo();

       // long dinero = 100 / p1.dinero;

        System.out.println(mensaje);

        try {
            long dinero = 100 / p1.dinero;
        }catch (IllegalArgumentException e){
            System.out.println("Error de dividion por cero " + e);
        }

        try {
            p1.setFechaNacimiento(LocalDate.now().plusDays(1));
        }catch(IllegalArgumentException e){
            System.out.println("Error al asignar fecha: " + e.getMessage());
        }

        try {
            int numero = 4/0;
        }catch(IllegalArgumentException e){
            System.out.println("Division por cero " + e.getMessage());
        }

        try {
            p1.setNombre(" ");
        }catch(IllegalArgumentException e){
            System.out.println("Error al asignar el nombre" + e.getMessage());
        }

    }

}
// TRY CATCH*