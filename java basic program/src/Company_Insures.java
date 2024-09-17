import java.util.Scanner;

public class Company_Insures {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age :");
        int age=in.nextInt();
        System.out.println("Enter the gender M/F:");
        char gen=in.next().charAt(0);
        char gender=Character.toLowerCase(gen);
        System.out.print("Enter the Marital Status U/M :");
        char status = in.next().charAt(0);
        if(status == 'M' || status == 'm')
        {
            System.out.println("Driver should be Insured.");
        }
        else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
        {
            System.out.println("Driver should be Insured.");
        }
        else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
        {
            System.out.println("Driver should be Insured.");
        }
        else
        {
            System.out.println("Driver should not be Insured.");
        }

    }
}
