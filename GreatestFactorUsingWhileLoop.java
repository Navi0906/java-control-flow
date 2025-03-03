import java.util.Scanner;

class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        int greatestFactor = 1; 
        
        // Check if the input is a positive integer
        if (number <= 1) {
            System.out.println("Invalid number");
        } else {
            int counter = number - 1; 
            
            // Loop until counter is equal to 1
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter; 
                    break; // Exit the loop
                }
                counter--; 
            }
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        }
    }
}