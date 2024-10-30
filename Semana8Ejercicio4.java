import java.util.Random;
import java.util.Scanner;
public class Semana8Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Ingrese el tamaño de las matrices: ");
        int n = sc.nextInt();
        int matriz[][] = new int[n][n];
        int matriz2[][] = new int[n][n];

        System.out.println("Matriz 1");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                int numeroAleatorio = rand.nextInt(100);
                matriz[i][j] = numeroAleatorio;
                System.out.print(matriz[i][j] + "|");        
            }
            System.out.println();
        }
        System.out.println("Matriz 2");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                matriz2[i][j] = matriz[i][j];
                if(i==j){
                    System.out.print(matriz2[i][j] + "|");
                }
                else{
                    System.out.print("0" + "|");
                }
            }
            System.out.println();
        }
    }
}