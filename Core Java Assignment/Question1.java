interface printable{
    void showTable(int n);
}

abstract class Abs{
    abstract void checkPalindrome(String str);
}

class Child extends Abs implements printable{
    void checkPalindrome(String str){
       int i=0; 
       int f=0;
       int j=str.length()-1;
       while(i<=j){
           if(str.charAt(i)==str.charAt(j)){
               i++;
               j--;
           }
           else{
               f=1;
               System.out.println("Not a Palindrome");
               break;
            }
        }
        if(f==0){
            System.out.println("Its a Palindrome");
        }

    }
    public void showTable(int n) {
        for(int i=1; i<=10; i++){
            System.out.println(n+ " * " + i + " = " + n*i);
        }
        
    }
    
}

class Question1{
    public static void main(String args[]){
        Child c = new Child();
        c.checkPalindrome("AMAN");
        c.showTable(13);
    }
}