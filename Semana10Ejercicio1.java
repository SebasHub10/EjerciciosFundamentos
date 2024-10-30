import java.util.ArrayList;
import java.util.Iterator;

public class Semana10Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> compañeros = new ArrayList<>();
        compañeros.add("José");
        compañeros.add("Carlos");
        compañeros.add("Luis");
        compañeros.add("Marta");
        compañeros.add("Sebastián");

        Iterator<String> iterator = compañeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}