import java.util.Scanner;

public class vowelsletterinpassage {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the passage:");
        String psg=in.nextLine();
        psg=psg.toLowerCase();
        int vowelcount=0;
        for (int i=0;i<psg.length();i++){
            char ch=psg.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowelcount++;
            }
        }
        System.out.println("the number of vowels in the string is : "+vowelcount);
    }
}
