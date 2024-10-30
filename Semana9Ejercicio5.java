import java.util.Scanner;
public class Semana9Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        
        
        StringBuilder palabraAlreves = new StringBuilder();

        for(int i = palabra.length()-1; i >= 0; i--){
            palabraAlreves.append(palabra.charAt(i));
        }
        System.out.println("palabra al reves: "+ palabraAlreves.toString());
    }
}