package myproject;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		int choice, qty,price, sum = 0;
		String order = "";
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To Snack Center");

		do {
			System.out.println("1. Tea (Rs. 10)");
			System.out.println("2. Green Tea (Rs. 15)");
			System.out.println("3. Samosa (Rs. 20)");
			System.out.println("4. Sandwitch (Rs. 50)");
			System.out.println("5. Generate Bill & Exi");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Quantity");
				qty = sc.nextInt();
				price = 10;
				sum=sum+(price*qty);
                order=order.concat("tea"+"\n");
				break;
			case 2:
				System.out.println("Enter Quantity");
				qty = sc.nextInt();
				price = 15;
				sum=sum+(price * qty);
                order=order.concat("Green tea"+"\n");
				break;
			case 3:
				System.out.println("Enter Quantity");
				qty = sc.nextInt();
				price = 20;
				sum=sum+(price * qty);
                order=order.concat("Samosa"+"\n");
				break;
			case 4:
				System.out.println("Enter Quantity");
				qty = sc.nextInt();
				price = 50;
				sum=sum+(price * qty);
                order=order.concat("Sandwitch"+"\n");
				break;
			case 5:
				quit = true;
				break;
			case 6:
			default:
                System.out.println("Wrong input");
			}
		} while (!quit);
		 System.out.println("**********BILL**********");
		 System.out.println("Your Orders are:\n"+order);
	        System.out.println("Your total bill="+sum);
	        
	         System.out.println("Thank you");
	}

}
