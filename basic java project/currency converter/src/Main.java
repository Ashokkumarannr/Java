import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double usdtoinrrate=83.00;
        double inrtousdrate=1;
        System.out.println("enter the converation type:");
        System.out.println("1: USD to INR");
        System.out.println("2: INR to USD");
        int choice=in.nextInt();

        switch (choice){
            case 1:
                System.out.println("enter the usd amount:");
                double usd= in.nextDouble();
                double convertedtoinr=usd*usdtoinrrate;
                System.out.println(usd+" usd=" +convertedtoinr+ "inr" );
                break;

            case 2:
                System.out.println("enter the inr amount:");
                double inr= in.nextDouble();
                double convertedtousd=inr*usdtoinrrate;
                System.out.println(inr+" inr=" +convertedtousd+ "inr" );
                break;
            default:
                System.out.println("Sorry ! invalid choose correct option:");
        }

    }
}