import java.util.ArrayList;

public class Semana10Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<String> compañeros = new ArrayList<>();
        compañeros.add("José");
        compañeros.add("Carlos");
        compañeros.add("Luis");
        compañeros.add("Marta");
        compañeros.add("Sebastián");

        for (String nombre : compañeros) {
            System.out.println(nombre);
        }
    }
}
