import java.util.*;

public class Question1 {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7);

        Collections.shuffle(myList);
        
        System.out.println("----------------------Stream Method---------------------");

        myList.stream().forEach(number->{
            System.out.println(number);
        });

        System.out.println("\n---------------------Traditional Method (For Loop)-------------------");
        
        for(int number : myList){
            System.out.println(number);
        }
    }    
}
