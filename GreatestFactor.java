import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        int greatestFactor = 1; 
        
        // Check if the input is a positive integer
        if (number <= 1) {
            System.out.println("Invalid Number.");
        } else {
            // Loop from number - 1 to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i; 
                    break; // Exit the loop
                }
            }
            System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
        }        
    }
}