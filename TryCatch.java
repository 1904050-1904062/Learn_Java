public class TryCatch {
    public void test(){
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
           System.out.println("Caught Exception : "+e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Programe continuous after finally.");
    }
}
