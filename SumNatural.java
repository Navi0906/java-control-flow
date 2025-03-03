import java.util.Scanner;
class SumNatural{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		// sum of n natural numbers using for loop
		for(int i = number;i>0;i--){
			sum1 += i;
		}
		
		// sum of n natural numbers using formulae
		int sum2 = (number*(number+1))/2;
		// checking if both methods give same result 
		boolean check = sum1==sum2;
		System.out.print("Is the sum using loop and using formulae same? "+check);
	}
}