import java.util.*;

public class Question3 {
    public static void TrimList( List<String> str ){
        ListIterator <String> myListIterator = str.listIterator();
        while(myListIterator.hasNext()){
            myListIterator.set(myListIterator.next().trim());
            
        }
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList(
            " Iphone ",
            " MacBook ", 
            " Iwatch ", 
            " Ipod ",
            " Iphone ",
            " MacBook ");
        
            TrimList(myList);

        for (String str : myList) {
            System.out.format("\"%s\"%n", str);
        }
    }

}
