import java.util.Scanner;
public class Mendador_Jiro_GWA {
	
	public static int cond (int grade) {
	  if (grade < 70) {
	  	grade = 70;
	  } 
	  else if (grade > 100) {
	  	grade = 100;
	  }
	  else {
	  	grade = grade;
	  }
	  return grade;
	}
	
	public static String converted (int enteredGrade) {
		//convert based on table
		String equivalent = "";
		
		if (enteredGrade <= 100 && enteredGrade >= 99)
		{
			equivalent = "\t\t 1.00\t\tA+\tExcellent+";
		}
		else if (enteredGrade <= 98 && enteredGrade >= 96 )
		{
			equivalent = "\t\t 1.25\t\tA\tExcellent-";
		}
		else if (enteredGrade <= 95 && enteredGrade >= 93 )
		{
			equivalent = "\t\t 1.50\t\tA-\tVery Good+ ";
		}
		else if (enteredGrade <= 92 && enteredGrade >= 90 )
		{
			equivalent = "\t\t 1.75\t\tB+\tVery Good -";
		}
		else if (enteredGrade <= 89 && enteredGrade >= 87 )
		{
			equivalent = "\t\t 2.00\t\tB\tGood+";
		}
		else if (enteredGrade <= 86 && enteredGrade >= 84 )
		{
			equivalent = "\t\t 2.25\t\tB-\tGood-";
		}
		else if (enteredGrade <= 83 && enteredGrade >= 81 )
		{
			equivalent = "\t\t 2.50\\ttC+\tFair+";
		}
		else if (enteredGrade <= 80 && enteredGrade >= 78 )
		{
			equivalent = "\t\t 2.75\t\tC\tFair-";
		}
		else if (enteredGrade <= 77 && enteredGrade >= 75 )
		{
			equivalent = "\t\t 3.00\t\tC-\tPassed";
		}
		else if (enteredGrade <= 74 && enteredGrade >= 72 )
		{
			equivalent = "\t\t 4.00\t\tD\tConditional";
		}  else {
			equivalent= "\t\t 5.00\t\tE\tFailed";
		}
		return equivalent;
		}
	
	public static float gwa (int gE1, int gE2, int gE3, int gE4, int gE5, int gE6) {
		float finalGradeGWA = 0;
		int totalGradeEquivalent = 0;
		
		//grade equivalent
		gE1 *= 3; gE2 *= 5; gE3 *= 3; gE4 *= 3; gE5 *= 3; gE6 *= 2;
	  
	  //total gE's
	   totalGradeEquivalent = gE1+gE2+gE3+gE4+gE5+gE6;
	   //gwa computation
	   finalGradeGWA =  (float) totalGradeEquivalent / 19;
	   return finalGradeGWA;
    }
	
		
    	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int computing = 0, programming = 0, drafting = 0, uts = 0, math = 0, pe = 0, nstp = 0;
	
	    System.out.print("GWA CALCULATOR\nEnter Student's Name: ");
	    String sName = in.nextLine();;
		
		//getting user input
		System.out.println("Enter Grade In The Following Subjects (70-100)");		
		System.out.println("CODE\t \t UNITS \t DESCRIPTION ");
		System.out.print("CCS 101 \t  3 \t INTRODUCTION TO COMPUTING: ");
		computing = in.nextInt();
		System.out.print("CCS 102 \t  5 \t COMPUTER PROGRAMMING: ");
		programming = in.nextInt();
		System.out.print("EMC 101 \t  5 \t DRAFTING: ");
		drafting= in.nextInt();
		System.out.print("GEC 001 \t  5 \t UNDERSTANDING THE SELF: ");
		uts = in.nextInt();
		System.out.print("GEC 004 \t  5 \t MATH IN MODERN WORLD: ");
		math = in.nextInt();
		System.out.print("PE 111\t\t  5 \t PHYS. FITNESS AND WELLNESS: ");
		pe = in.nextInt();
		System.out.print("NSTP 111 \t  5 \t NSTP (CWTS) 1 : ");
		nstp = in.nextInt();
		
		//method for entered grades to be automatically 70 if the user inputs
		//below 70 and automatically be 100 if the user inputs above 100
	    computing = cond(computing);
		programming = cond(programming);
		drafting = cond(drafting);
		uts = cond(uts);
		math = cond(math);
		pe = cond(pe);
		nstp = cond(nstp);
		
		//clearing console
		System.out.println();
		System.out.print("\033[H\033[2J");  
		System.out.flush();
		System.out.println();
		
		//displaying converted grades
		System.out.println("\nCONVERTED GRADES\nSUBJECT \t\t   GRADE \t11PT SYSTEM\tRATING\tREMARKS");
		System.out.println("Intro To Computing \t  : "+computing+converted(computing));
		System.out.println("Computer Programming \t  : "+programming+converted(programming));
		System.out.println("Drafting \t\t  : "+drafting+converted(drafting));
		System.out.println("Understanding The Self \t  : "+uts+converted(uts));
		System.out.println("Math In Modern World \t  : "+math+converted(math));
		System.out.println("Phys. Fitness And Wellness: "+pe+converted(pe));
		System.out.println("Nstp (Cwts) 1 \t\t  : "+nstp+converted(nstp));
		
		//gwa method
		System.out.println("========================\n"+sName+"'s GWA\n========================");
		System.out.println("GWA : "+gwa(computing, programming, drafting,uts,math,pe));
		in.close();	
	}
}