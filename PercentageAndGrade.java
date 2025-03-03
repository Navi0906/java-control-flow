import java.util.Scanner;

class PercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();
        
        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        
        // Output the percentage
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
		
		
		// Grading on the basis of percentage
		if(percentage>=80){
			System.out.println("Grade: A");
			System.out.println("Remarks: Level 4, above agency-normalized standards");
		}
		else if(percentage<=79 && percentage>=70){
			System.out.println("Grade: B");
			System.out.println("Remarks: Level 3, at agency-normalized standards");
		}
		else if(percentage<=69 && percentage>=60){
			System.out.println("Grade: C");
			System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
		}
		else if(percentage<=59 && percentage>=50){
			System.out.println("Grade: D");
			System.out.println("Remarks: Level 1, well below agency-normalized standards");
		}
		else if(percentage<=49 && percentage>=40){
			System.out.println("Grade: E");
			System.out.println("Remarks: Level -1, too below agency-normalized standards");
		}
		else{
			System.out.println("Grade: F");
			System.out.println("Remarks: Remedial Students");
		}
    }	
}