import java.util.Scanner;
class SpringSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month number: ");
		int month = sc.nextInt();
		System.out.print("Enter the date: ");
		int day = sc.nextInt();
		
		if((month == 3 && day>=10 && day<=31) ||
		(month == 4 && day>= 1 && day<=30) ||
		(month == 5 && day>= 1 && day<=31) ||
		(month == 6 && day>= 1 && day<=20)){
			System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
	}
}