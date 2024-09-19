
public class Main {

   /*public static void main(String[] args) {
        //AddNum a = new AddNum();
        //a.ADD();
       // Loop l = new Loop();
        //l.Series(20);
        //Array a = new Array();
        //a.PrintArray();
       // List l = new List();
        //l.show();
        //QU q = new QU();
        //q.show();
        //Car c = new Car();
        //c.display();
        //TryCatch t = new TryCatch();
        //t.test();
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();
    }*/
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();  // Starts the thread

        // Ensure the main thread waits for t1 to finish execution
        t1.join();   // This makes the main thread wait until t1 finishes
    }
    
}