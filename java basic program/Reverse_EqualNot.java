import java.util.Scanner;

public class Reverse_EqualNot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the digit:");
        int num=in.nextInt();
        int rem,sum=0,a=num;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;

        }
        if (a==sum){
            System.out.println("equal:"+a);
        }else{
            System.out.println("not equal:"+a);
        }
    }
}

/*
rem = num % 10  => rem = 12321 % 10 = 1
sum = (sum * 10) + rem => sum = (0 * 10) + 1 = 1
num = num / 10 => num = 12321 / 10 = 1232

rem = num % 10 => rem = 1232 % 10 = 2
sum = (sum * 10) + rem => sum = (1 * 10) + 2 = 12
num = num / 10 => num = 1232 / 10 = 123

//reverse String
reverse=" "
enter the string
for(int i=str.length()-1;i>=0;i--)
reversed+=str.charAt(i);

*/