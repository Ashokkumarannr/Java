import java.util.*;
public class Grade{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Input the Roll Number of the student :");
int rollNo=scan.nextInt();
System.out.print("Input the Name of the Student :");
String name=scan.next();
System.out.print("Input the marks of Physics, Chemistry and Computer Application :");
int Physics=scan.nextInt();
int Chemistry=scan.nextInt();
int ComputerApplication=scan.nextInt();
int TotalMarks=Physics+Chemistry+ComputerApplication;
Double Percentage=(TotalMarks/300.0)*100.0;
System.out.println("Roll No :"+rollNo);
System.out.println("Name of Student :"+name);
System.out.println("Marks in Physics :"+Physics);
System.out.println("Marks in Chemistry :"+Chemistry);
System.out.println("Marks in Computer Application :"+ComputerApplication);
System.out.println("Total Marks ="+TotalMarks);
System.out.println("Percentage = "+Percentage);
String Division;
if(Percentage>=60)
{
Division="First";
}
else if(Percentage<=60 && Percentage>=45)
{
Division="Second";
}
else if(Percentage<=45 && Percentage>=33)
{
Division="Third";
}
else
{
Division="Fail";
}
System.out.println("Division = "+Division);
}

}