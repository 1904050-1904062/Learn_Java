public class MyThread extends Thread{
    
    private Counter ct;

    public MyThread(Counter ct){
        this.ct = ct;
    }
    
    public void run(){
        System.out.println("Thread is running");
        for(int i=0; i<1000; i++){
            ct.increment();
        }
    }
}