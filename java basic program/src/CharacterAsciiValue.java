import java.util.*;

public class CharacterAsciiValue
{
	public static void main (String[] args) 
	{
		// your code goes here
		System.out.println("Enter any character");
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		int a=ch;
		System.out.println(a);
	}
}