public class Semana9Ejercicio4 {
    public static void main(String[] args) {
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "esta";
        String str3 = "string";
        str1 = str1.toLowerCase();
        int i = 0;

        System.out.println("Str2 dentro de Str1");

        while((i = str1.indexOf(str2, i)) != -1){
            System.out.println(i);
            i += str2.length();
        }

        System.out.println("Str3 dentro de Str1");
        while((i = str1.indexOf(str3, i)) != -1){
            System.out.println(i);
            i += str3.length();
        }
    }
}