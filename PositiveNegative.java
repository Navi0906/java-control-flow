import java.util.Scanner;
class PositiveNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// Checking the number is positive, negative or zero
		if(number<0){
			System.out.print("negative");
		}
		else if(number>0){
			System.out.print("positive");
		}
		else{
			System.out.print("zero");
		}
	}
}