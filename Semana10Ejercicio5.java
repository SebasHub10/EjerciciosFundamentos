import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Semana10Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = leerValores();
        
        int suma = calcularSuma(valores);
        double promedio = (double) suma / valores.size();
        
        int numMenores = calcularNroMenores(valores, promedio);
        int numMayores = calcularNroMayores(valores, promedio);
        
        System.out.println("Número de valores leídos: " + valores.size());
        System.out.println("Suma de valores: " + suma);
        System.out.println("Promedio de valores: " + promedio);
        System.out.println("Número de elementos menores al promedio: " + numMenores);
        System.out.println("Número de elementos mayores o iguales al promedio: " + numMayores);
        
        System.out.println("Valores menores al promedio:");
        mostrarMenores(valores, promedio);
        
        System.out.println("Valores mayores o iguales al promedio:");
        mostrarMayores(valores, promedio);
    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce valores enteros (0 o negativo para terminar):");
        while (true) {
            int valor = scanner.nextInt();
            if (valor <= 0) {
                break;
            }
            valores.add(valor);
        }
        scanner.close();
        return valores;
    }

    public static int calcularSuma(ArrayList<Integer> valores) {
        int suma = 0;
        Iterator<Integer> iterator = valores.iterator();
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        return suma;
    }

    public static int calcularNroMenores(ArrayList<Integer> valores, double promedio) {
        int contador = 0;
        for (int valor : valores) {
            if (valor < promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static int calcularNroMayores(ArrayList<Integer> valores, double promedio) {
        int contador = 0;
        for (int valor : valores) {
            if (valor >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarMenores(ArrayList<Integer> valores, double promedio) {
        for (int valor : valores) {
            if (valor < promedio) {
                System.out.println(valor);
            }
        }
    }

    public static void mostrarMayores(ArrayList<Integer> valores, double promedio) {
        for (int valor : valores) {
            if (valor >= promedio) {
                System.out.println(valor);
            }
        }
    }
}