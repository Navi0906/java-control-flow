import java.util.Scanner;

class FizzBuzzForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

		// checking if the entered number is positive number
        if (number < 1) {
            System.out.println("Invalid number.");
        }
		// printing numbers wiht condition where multiple of 3 print "Fizz", multiple of 5 print "Buzz" and both print "FizzBuzz" 
		else {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
