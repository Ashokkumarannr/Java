import java.util.Scanner;

public class leapyearornot {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=in.nextInt();
        boolean flag=false;
        if (year%400==0)
            flag=true;
        else if (year%100==0)
            flag=false;
        else if(year%4==0)
            flag=true;
        else
            flag=false;
        if(flag){
            System.out.println("year"+year+"is a leap year");

        }
        else {
            System.out.println("year "+year+" is not a leap year");
        }
    }
}
