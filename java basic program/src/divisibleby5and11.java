import java.util.Scanner;

public class divisibleby5and11 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=in.nextInt();
        if (num%5==0&&num%11==0) {
            System.out.println("Given number is divible by 5 and 11:" + num);
        }
        else{
            System.out.println("notdivible by 5 and 11 : " + num);
            }
        }
    }

