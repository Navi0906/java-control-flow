import java.util.Scanner;
class SumNatural{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		for(int i = number;i>0;i--){
			sum1 += i;
		}
		
		int sum2 = (number*(number+1))/2;
		boolean check = sum1==sum2;
		System.out.print("Is the sum using loop and using formulae same? "+check);
	}
}