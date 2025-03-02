import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();
		int result = 1;
		if(number>0){
			while(number>0){
				result *= number;
				number--;
			}
			System.out.print("Factorial of the given number is "+result);
		}
		else{
			System.out.print("The given number is not positive");
		}
	}
}