import java.util.Scanner; 

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0; 
        int originalNumber = number; 
        
        // Use a while loop to process each digit of the number
        while (originalNumber != 0) {
            
            int digit = originalNumber % 10; // Get the last digit            
            sum += digit * digit * digit;  
            originalNumber /= 10; 
        }
        
        // Check if the original number and the sum of cubes are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
	}
}