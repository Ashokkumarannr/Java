import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first angle:");
        int angle1=in.nextInt();
        System.out.println("Enter the first angle:");
        int angle2=in.nextInt();
        System.out.println("Enter the first angle:");
        int angle3=in.nextInt();
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
