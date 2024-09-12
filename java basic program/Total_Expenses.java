import java.util.Scanner;
class Total_Expenses
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Quantity Purchased : ");
        int qty = input.nextInt();
        System.out.print("Enter the Amount Per Item : ");
        float amt = input.nextFloat();
        float exp;
        if(qty>100)
        {
            exp = qty * amt;
            exp = exp-(exp * 0.1f);
        }
        else
        {
            exp = qty * amt;
        }
        System.out.println("Total Expenses is : "+exp);
    }
}