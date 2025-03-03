import java.util.Scanner; 

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number greater than 1: ");
        int number = sc.nextInt(); 
        
        // Check if the number is greater than 1
        if (number <= 1) {
            System.out.println("invalid");
        } else {
            boolean isPrime = true; 
            
            // Loop through all numbers from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // Check if the number is divisible by i
                if (number % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }
            
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}