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

        // Finding the power of a number
        System.out.print("Enter a positive integer for the base: ");
        int base = sc.nextInt();
        System.out.print("Enter a positive integer for the power: ");
        int power = sc.nextInt();
        
        // Check if both base and power are positive integers
        if (base > 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= base;
                counter++;
            }
            System.out.println(base + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter positive integers for both base and power.");
        }        
    }
}