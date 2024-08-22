import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);


        System.out.println("Enter the number of values you want to calculate:");
        int count = num.nextInt();


        double[] numbers = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = num.nextDouble();
        }


        System.out.println("Enter the operation (+, -, *, %, /):");
        char op = num.next().charAt(0);

        double result = numbers[0];


        // Perform the operation for all numbers
        for (int i = 1; i < count; i++) {
            switch (op) {
                case '+':
                    result += numbers[i];
                    break;
                case '-':
                    result -= numbers[i];
                    break;
                case '*':
                    result *= numbers[i];
                    break;
                case '%':
                    result %= numbers[i];
                    break;
                case '/':
                    if (numbers[i] != 0) {
                        result /= numbers[i];
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");

                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    //validOperation = false;
                    break;
            }
        }


            System.out.println("The result of " + op + " operation is: " + result);
        }
    }

