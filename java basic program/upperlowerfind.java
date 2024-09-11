import java.util.Scanner;

public class upperlowerfind {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the string:");
        String word=in.nextLine();
        int lower=0,capital=0,special=0;
        for (int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if (ch>='a'&& ch<='z'){
                lower++;

            }
            else if (ch>='A'&&ch<='Z'){
                capital++;
            }
            else if (ch!= ' '){
                special++;
            }
        }
        System.out.println("captial:"+capital);
        System.out.println("lower:"+lower);
        System.out.println("Special Characters: " + special);
    }
}
