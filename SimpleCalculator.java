import java.util.Scanner; 

class SimpleCalculator { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble(); 
		
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble(); 
        
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();
        
        double result = 0; 
        
        // Use switch...case to perform the operation based on the operator
        switch (op) {
            case "+":
                result = first + second; 
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second; 
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second; 
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second; 
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}