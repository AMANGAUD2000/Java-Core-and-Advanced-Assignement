
class FetchData extends Thread{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(5000);
            System.out.println("First thread is running..." + Thread.currentThread().getName());  
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }
    }
}

class ProcessData implements Runnable{
    public void run(){
        for(int i=1; i<=2; i++){
        try {
            Thread.sleep(1000);
            System.out.println("Second thread is running... "+ Thread.currentThread().getName());  
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
    }
    }

}

public class Question3 {
    public static void main(String[] args) throws InterruptedException{
        FetchData first = new FetchData();
        Thread tOne = new Thread(new ProcessData(), "Thread One");

        first.start();
        first.join();
        tOne.start();
        tOne.join();
        
    }
}
