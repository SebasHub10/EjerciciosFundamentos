import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Semana10Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        ArrayList<Integer> arregloDinamico = crearArreglo(n);
        
        int[] arregloEstatico = convertirArrDinamico(arregloDinamico);
        
        imprimirArrEst(arregloEstatico);
        
        scanner.close();
    }
    
    public static ArrayList<Integer> crearArreglo(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            arr.add(random.nextInt(100));
        }
        
        return arr;
    }
    
    public static int[] convertirArrDinamico(ArrayList<Integer> arr) {
        int[] arrayEstatico = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            arrayEstatico[i] = arr.get(i);
        }
        
        return arrayEstatico;
    }
    
    public static void imprimirArrEst(int[] arr) {
        System.out.println("Contenido del arreglo estático:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
