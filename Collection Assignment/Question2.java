import java.util.*;

public class Question2 {
    static final Comparator<String> comp = new Comparator<String>() {

        public int compare(String str1, String str2){
            
            return str1.compareTo(str2);
        }

    };

    public static void main(String[] args){
        SortedSet<String> mySortedSet = new TreeSet<String>(comp);
        String myArray[] = {
            "Iphone",
            "MacBook", 
            "Iwatch", 
            "Ipod",
            "Iphone",
            "MacBook"
        };

        for(String str : myArray){
            mySortedSet.add(str);
        }

        System.out.println(mySortedSet.size() + " distinct words: " + mySortedSet);
    }
}
