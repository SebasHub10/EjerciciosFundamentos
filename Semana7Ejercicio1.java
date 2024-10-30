import java.util.Scanner;
public class Semana7Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del arreglo: ");
        int x = sc.nextInt();
        int arr_int[] = new int[x];

        for (int i = 0; i < arr_int.length; i++){
            System.out.print("Ingrese entero: ");
            int j  = sc.nextInt();
            arr_int[i] = j * 2;
        }
        for (int i = 0; i < arr_int.length; i++){
                System.out.println("3 x " + arr_int[i] +" = " + arr_int[i] * 3 );
        }
        
        
    }
}