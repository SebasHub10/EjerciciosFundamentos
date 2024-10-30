import java.util.Scanner;
public class Semana7Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int arr_int[] = new int[n];
        int arreglo2[] = new int[n];
        System.out.println();

        for(int i = 0; i < arr_int.length; i++){
            System.out.print("Ingrese un numero: ");
            arr_int[i] = sc.nextInt();
        }
        for(int i = 0; i < arr_int.length; i++){
            System.out.print(arr_int[i] + "|");
        }

        System.out.println();
        for(int i = 0; i < arreglo2.length; i++){
            arreglo2[i] = arr_int[arr_int.length - 1 - i];
            System.out.print(arreglo2[i] + "|");
        }
    }
    
}