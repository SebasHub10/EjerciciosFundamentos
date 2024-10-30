import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Semana10Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arregloEstatico = crearArreglo(n);
        
        ArrayList<Integer> arregloDinamico = convertirArrEstatico(arregloEstatico);
        
        imprimirArrDin(arregloDinamico);
        
        scanner.close();
    }
    
    public static int[] crearArreglo(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        
        return arr;
    }

    public static ArrayList<Integer> convertirArrEstatico(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int num : arr) {
            arrayList.add(num);
        }
        
        return arrayList;
    }
    
    public static void imprimirArrDin(ArrayList<Integer> arr) {
        System.out.println("Contenido del arreglo dinámico:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}