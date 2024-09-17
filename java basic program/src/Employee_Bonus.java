import java.util.Scanner;

public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the current year:");
        int crt=in.nextInt();
        System.out.println("Enter the Year of joining:");
        int join=in.nextInt();
        int bonus=crt-join;
        if (bonus>3){
            int s=bonus*500;
            System.out.println("You get a Bonus of Rs:"+s);
            System.out.println("Added to your salary!");
        }
        else{
            System.out.println("No bonus");
        }
    }
}
