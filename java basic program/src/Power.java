import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the base number :");
        int base=in.nextInt();
        System.out.println("Enter the power :");
        int power=in.nextInt();
        int result=1;
        for (int i=1;i<=power;i++){
            result=result*base;
        }
        System.out.println(result);
    }
}
