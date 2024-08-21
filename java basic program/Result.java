/*8. Write a java program to read roll no, name and marks of three subjects and calculate the total and percentage. 

Test Data :
Input the Roll Number of the student :784
Input the Name of the Student :James
Input the marks of Physics, Chemistry and Computer Application : 70 80 90

Expected Output :
Roll No : 784
Name of Student : James
Marks in Physics : 70
Marks in Chemistry : 80
Marks in Computer Application : 90
Total Marks = 240
Percentage = 80.00*/

import java.util.*;
public class Result{
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
}
}