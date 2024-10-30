import java.util.Scanner;
public class Semana9Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        String resultado = funcionPar(str1);
        System.out.println("Su resultado es: "+ resultado);
    }
    static String funcionPar(String str1){

        if((str1.length() % 2) == 0){
            char a1 = str1.charAt(0);
            char a2 = str1.charAt(str1.length()-1);
            return String.valueOf(a1)+ a2;
        }else{
            char a1 = str1.charAt(0);
            char a2 = str1.charAt(str1.length()-1);
            char a3 = str1.charAt(str1.length() / 2);
            return String.valueOf(a1) + a3 + a2;
        }

    }
}