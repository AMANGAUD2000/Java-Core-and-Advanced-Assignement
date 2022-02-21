class Message{
    private String data;  
    synchronized void writeData(String str){ 
        this.data = str;
    }
    
    synchronized void readData(){ 
        System.out.println(data);
    }
}  


  
class Writer extends Thread{  
Message text;  
Writer(Message text){  
this.text=text;  
}  
public void run(){  
    text.writeData("Aman Gaud");  
}  
  
}  
class Reader extends Thread{  
Message text;  
Reader(Message text){  
    this.text=text;  
}  
public void run(){  
    text.readData();  
}  
}  
  
public class Question4{  
public static void main(String args[]){  
    Message msg = new Message(); 
    Writer w=new Writer(msg);  
    Reader r=new Reader(msg);  
    w.start();  
    r.start();  
}  
}  