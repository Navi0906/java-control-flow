import java.util.Scanner;

class MultiplesAndPowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        
        // Check if the number is a positive integer and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 99; // Start from 99
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid");
        }

            
    }
}