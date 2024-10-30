import java.util.Scanner;
public class Semana7Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = sc.nextInt();
        int arreglo1[] = new int[n];
        double arreglo2[] = new double[n/2];



        for(int i = 0; i < arreglo1.length; i++){
            arreglo1[i] = i + 1;
            System.out.print(arreglo1[i] + "|");
        }
        System.out.println();
        for(int j = 0; j < arreglo2.length; j++){
            arreglo2[j] = (arreglo1[j * 2] + arreglo1[j * 2 + 1]) / 2.0;
            System.out.print(arreglo2[j] + "|");

        }
        
    }
}