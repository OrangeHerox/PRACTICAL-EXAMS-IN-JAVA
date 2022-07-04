import java.util.Scanner;
public class Mendador_Jiro_StarOfDavid {

	public static void DrawStarOfDavid(int number) {
		int i = 0, k = 0, j = 0;
		for (i = number; i > 0; i--) {
			if (i % 2 == 1) {
				if (i == 3 || i == 5) {
					continue;
				}
				for (k = 0; k <  i / 2; k++) {
					System.out.print("_ ");
				}
				for (j = number; j >= i; j--) {
					System.out.print("* ");
				}
				for (k = 0; k < i / 2; k ++) {
					System.out.print("_ ");
				}
				System.out.println();
			}
		}
		//
		for (i = number / number; i > 0; i--) {
			for (k = 0; k < i; k++) {
				System.out.print("_ ");
			}
			for (j = number - 1; j > i; j--) {
				System.out.print("* ");
			}

			for (k = 0; k <  i; k++) {
				System.out.print("_ ");
			}
			System.out.println();
		} //
		for (i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				if (i == 3 || i == 5) {
					continue;
				}
				for (k = 0; k <  i / 2; k++) {
					System.out.print("_ ");
				}
				for (j = number; j >= i; j--) {
					System.out.print("* ");
				}

				for (k = 0; k < i / 2; k++) {
					System.out.print("_ ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;

		System.out.println("STAR OF DAVID PATTERN");
		System.out.println("Enter An Odd Number In The Range Of Seven And Above");
		System.out.print("Enter The Number : ");
		number = in.nextInt();

		if (number % 2 == 0 || number < 7) {
			System.out.print("Please Enter An Odd Number (7 And Above) ");
		} else {
			DrawStarOfDavid(number);
		}
		in.close();
	}
}