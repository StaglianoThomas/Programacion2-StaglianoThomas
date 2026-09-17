import java.util.Arrays;

public class EjercicioClase {
    public static void main(String[] args){

    int[] arr = {6,8,1,9,10,45,2,0};
    System.out.println(Arrays.toString(arr));
    ordernarElementos(arr);
    System.out.println(Arrays.toString(arr));


    }

    public static void ordernarElementos(int[] arr){

            for(int i = 0; i < arr.length; i++ ){
                for (int j = 0; j < arr.length - 1; j++){
                    // DEBUG //
                    System.out.println(j);
                    System.out.println(Arrays.toString(arr));
                    System.out.println((arr[j]) + " - " + (arr[j+1]));
                    // DEBUG //

                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    System.out.println(j);

            }
        }
    }
}
