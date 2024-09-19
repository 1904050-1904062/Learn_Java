import java.util.Scanner;;

public class AddNum {
    public void ADD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();

        System.out.println("Enter another number : ");
        int y = sc.nextInt();
        int ans = x+y;
        sc.close();
        System.out.println("Ans : "+ ans);
    }
}
