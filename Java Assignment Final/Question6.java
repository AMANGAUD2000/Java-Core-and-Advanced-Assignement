import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.next();
        input = input.toLowerCase();

        Map<Integer, Long> characters = input.codePoints().mapToObj(data -> data)
    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

  int position = characters.entrySet().stream().filter(key -> key.getValue() > 1L).findFirst().map(Map.Entry::getKey)
    .orElse(Integer.valueOf(Character.MIN_VALUE));

    System.out.println(String.valueOf(Character.toChars(position)));
    }    
}
