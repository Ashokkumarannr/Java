import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.println("enter the starting no:");
        int s=in.nextInt();
        System.out.println("Enter the ending no:");
        int e=in.nextInt();
        System.out.println("Enter the table");
        int t=in.nextInt();
        while(s<=e){
            System.out.println(s+"*"+t+"="+(s*t));
            s++;
        }
    }
}
