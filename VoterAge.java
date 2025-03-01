import java.util.Scanner;
class VoterAge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age<18){
			System.out.print("The person cannot vote");
		}
		else{
			System.out.print("The person can vote");
		}
		
		
	}
}