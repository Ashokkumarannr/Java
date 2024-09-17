import java.util.Scanner;

public class charisalphabetornot {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the character:");
        char let=in.next().charAt(0);
        if (let>='a'&&let<='z' || let>='A'&&let<='z'){
            System.out.println("character is alphabets: "+let);
        }
       else{
            System.out.println("not a alphabets: "+ let);
        }
    }
}
