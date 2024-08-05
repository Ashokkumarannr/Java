import java.util.*;
public class StringLength {
   public static void main(String args[]) throws Exception {
       Scanner scan=new Scanner(System.in);
      String str =scan.nextLine();
      int i = 0;
      for(char c: str.toCharArray()) {
         i++;
      }
      System.out.println("Length of the given string ::"+i);
   }
}