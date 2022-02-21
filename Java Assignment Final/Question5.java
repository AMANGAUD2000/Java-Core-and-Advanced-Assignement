import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Second highest elemet is "+arr[1]);
        
     }
}
