import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class threenumbermax {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
        System.out.println("enter the number1:");
        int num1=in.nextInt();
        System.out.println("enter the number2:");
        int num2=in.nextInt();
        System.out.println("enter the number3:");
        int num3=in.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("num 1 is greater:"+num1);
        }
        if (num1<num2 && num3<num2){
            System.out.println("num 2 is greater:"+num2);
        }
        else {
            System.out.println("num 3 is greater:"+num3);
        }
    }
}