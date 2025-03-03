import java.util.Scanner;
class SumOfNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		System.out.print("Enter the number: ");
		double number = sc.nextDouble();
		
		// sum of user input number until 0 or negative is entered
		while(number!=0){
			System.out.print("Enter the number you want to add or enter 0 to display the sum: ");
			sum += number;
			number = sc.nextDouble();
		}
		
		System.out.print("The sum is "+sum);
	}
}