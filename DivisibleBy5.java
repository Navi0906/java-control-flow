import java.util.Scanner;
class DivisibleBy5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// checking if the number is divisible by 5 or not
		boolean isDivisible = (number%5==0);
		System.out.print("Is the number "+number+" divisible by 5? "+isDivisible);
	}
}