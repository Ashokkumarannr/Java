import java.util.Scanner;

public class All_Side_Triangle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Sides of Triangle :");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        if((side1 + side2) > side3)//20+30=50 >40
            if((side2 + side3) > side1)//30+40=70>20
                if((side1 + side3) > side2) //20+50=70>30
                    System.out.println("Triangle is valid.");
                else
                    System.out.println("Triangle is not valid.");
            else
                System.out.println("Triangle is not valid.");
        else
            System.out.println("Triangle is not valid.");
    }
}
