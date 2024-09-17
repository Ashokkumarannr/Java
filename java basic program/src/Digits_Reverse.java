import java.util.Scanner;

public class Digits_Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the digit :");
        int d=in.nextInt();
        int a=d,rem=0,rev=0;
        while(d>0){
            rem=d%10;
            rev=rev*10+rem;
            d=d/10;
        }
        System.out.println("given digit:"+a);
        System.out.println("reverse digit:"+rev);
    }
}
