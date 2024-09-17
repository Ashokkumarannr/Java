import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the digit:");
        int num=in.nextInt();
        int a=num;
        int rem=0,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.println("given digits :"+a);
        System.out.println("sum of digit :"+sum);

    }
}
