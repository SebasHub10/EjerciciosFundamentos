import java.util.Scanner;
public class Semana7Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int j;
        int arreglo1[] = new int[n];
        for (int i = 0; i < arreglo1.length; i++){
            arreglo1[i] = i + 1;
            System.out.print(arreglo1[i] + "|");
        }
        System.out.println();
        for(int i = 0; i < arreglo1.length/2; i++){
            j = arreglo1[i];  
            arreglo1[i] = arreglo1[n - 1 -i];
            arreglo1[n - i - 1]= j;
        }
        for (int i = 0; i < arreglo1.length; i++){
            System.out.print(arreglo1[i] + "|");
        }
    }
}