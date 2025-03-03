import java.util.Scanner; 

class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); 
        
        
        int count = 0; 
        
        // Use a loop to count the number of digits
        while (number != 0) {
            number /= 10; 
            count++; 
        }
        
        // Check if the count is 0 
        if (count == 0) {
            count = 1; 
        }
        
        System.out.println("Number of digits: " + count);        
    }
}