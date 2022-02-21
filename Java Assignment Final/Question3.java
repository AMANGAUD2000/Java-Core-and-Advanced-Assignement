import java.util.*;

public class Question3 {
    public static void main(String[] args){
        ArrayList <String> MarvelCharacters = new ArrayList<String>();
        MarvelCharacters.add("Iron Man");
        MarvelCharacters.add("Captain America");
        MarvelCharacters.add("Hulk");
        MarvelCharacters.add("Thor");
        MarvelCharacters.add("Spider Man");
        MarvelCharacters.add("Black Widow");

        System.out.println("Iterating using advanced for loop");
        MarvelCharacters.forEach((character)->{
            System.out.println(character);
        });

        System.out.println("\nIterate using while loop");
        Iterator itr = MarvelCharacters.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nIterate using for loop");
        for(String character:MarvelCharacters){
            System.out.println(character);
        }

    }
}
