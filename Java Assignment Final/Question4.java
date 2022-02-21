import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char[] character = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
            if(character[i] == character[j]){
                System.out.println(character[j]);
            }
        }
    }}
    
}
