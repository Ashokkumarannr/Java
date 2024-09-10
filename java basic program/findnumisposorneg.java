import java.util.Scanner;

public class findnumisposorneg {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        try {
            int num = in.nextInt();
            if (num > 0) {
                System.out.println("Number is positive:" + num);
            } else if (num < 0) {
                System.out.println("Number is negative:" + num);

            } else {
                System.out.println("zero");
            }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("invaild");
        }
    }
}
