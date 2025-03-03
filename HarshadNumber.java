import java.util.Scanner; 

class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); 
        
        int sum = 0; 
        int originalNumber = number; 
        
        // Use a while loop to calculate the sum of the digits
        while (number != 0) {
            int digit = number % 10; 
            sum += digit; 
            number /= 10; 
        }
        
        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }        
    }
}