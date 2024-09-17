import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=in.nextInt();
        int count=0;
        for (int i=2;i<=num;i++){
            if (i%2==0){
                count++;
                break;
            }
        }
        if(count==0) {
            System.out.println("This is prime number ");
        }else{
                System.out.println("this not a prime number");
            }
        }




    }

