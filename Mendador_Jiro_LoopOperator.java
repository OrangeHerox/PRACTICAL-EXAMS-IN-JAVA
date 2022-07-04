import java.util.Scanner;
public class Mendador_Jiro_LoopOperator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		int prod = 0, quo = 0, rem = 0;
		int i = 0;
		int temp1 = 0;
			
		System.out.println("LOOP OPERATOR");
		System.out.print("Enter First Number : ");
		num1 = in.nextInt();
		System.out.print("Enter Second Number : ");
		num2 = in.nextInt();

		if (num1 >= 0 && num2 >= 0) {
			//
			temp1 = num1; // for remainder
			for (i = 1; i <= num2; i++) { // loop for finding product
				prod += num1;
				while (temp1 >= num2) { // loop for finding quotient and remainder
					temp1 -= num2;
					quo++;
				}
			}
		System.out.println("The Product of "+num1+" and "+num2+" is =  "+prod);

			if (num2 == 0) { // To know that A number divided Zero Is A Math Error
					System.out.println("DIVISION WITH ZERO ERROR!");
					System.out.println("ERROR Showing Remainder!");
			} else {
			        System.out.println("The Integer Quotient of "+num1+" and "+num2+" is = "+quo);
				    System.out.println("The Integer Remainder of "+num1+" and "+num2+" is = "+temp1);
			}
			//
		} else {
			System.out.print("The Program Only Accepts Positive Integer");
		}

	}
}