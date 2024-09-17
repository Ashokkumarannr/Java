import java.util.Scanner;

public class Sumof_even {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number limit:");
        int l=in.nextInt();
        int sum=0;

        for(int s=1;s<=l;s++){
            if (s%2==0){
                sum=sum+s;}
        }
        System.out.println("Total:"+" "+ sum);
    }
}