import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class Question2 {
    // Write a Java Program to count the number of words in a string using HashMap.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Enter a string");
        String str = sc.nextLine();

        String[] wordList = str.split(" ");
        for (String word : wordList) {
            word = word.toLowerCase();
            Integer count = map.get(word);
            if (count == null) {
                map.put(word, 1);
            } else {
                map.put(word, count + 1);
            }
        }
        System.out.println(map);
    }
}
