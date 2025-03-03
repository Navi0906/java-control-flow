import java.util.Scanner;

class PowerCalculatorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for the base: ");
        int number = sc.nextInt();
        
        System.out.print("Enter a positive integer for the power: ");
        int power = sc.nextInt();
        
        // Check if both number and power are positive integers
        if (number > 0 && power >= 0) {
            int result = 1; // Initialize result
            int counter = 0; // Initialize counter
            
            // Calculate the power using a while loop
            while (counter < power) {
                result *= number; 
                counter++; 
            }
            
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Invalid");
        }
    }
}