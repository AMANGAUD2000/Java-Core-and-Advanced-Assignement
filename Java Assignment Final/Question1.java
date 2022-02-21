import java.security.KeyStore.Entry;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Map<Integer, String> languages = new HashMap<Integer, String>();
        languages.put(1, "Iron Man");
        languages.put(2, "Hulk");
        languages.put(3, "Captain America");
        languages.put(4, "Thor");
        languages.put(5, "Spider Man");

        System.out.println("\nIterating Hash Map using advanced forEach loop");
        languages.forEach((key, value) -> {
            System.out.println("Key : " + key + ", Value : " + value);
        });

        System.out.println("\nIterating Hash Map using While loop");
        Iterator<Integer> itr = languages.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Key : " + key + ", Value : " + languages.get(key));

        }
    }
}
