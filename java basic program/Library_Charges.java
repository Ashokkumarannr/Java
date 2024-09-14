import java.util.Scanner;

public class Library_Charges {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the days:");
        int day=in.nextInt();
        int amt;
        if (day>0 && day<=5){
            amt=(int)0.5*day;
            System.out.println("Fine Amount Pay to Rs :"+ amt);

        }
        else if (day>=6 && day<=10){
            amt = 1 * day;
            System.out.println("Fine Amount Pay to Rs :"+ amt);
        }
        else if(day > 10)
        {
            amt = 5 * day;
            System.out.println("Fine Amount Pay to Rs :"+ amt);
            if(day>30)
            {
                System.out.println("Your Membership would be Cancelled..");
            }
        }
        else
        {
            System.out.println("Invalid");
        }

    }
}
