import java.util.Scanner;

public class Sum_Numbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number limit:");
        int l=in.nextInt();
        int sum=0;

        for(int s=1;s<=l;s++){
            sum=sum+s;
        }
        System.out.println("Total:"+" "+ sum);
    }
}
