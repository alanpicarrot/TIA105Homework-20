package work2;

public class Homework2 {

	static void evenAdd() {

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 2 == 0) {

				sum += i;

			}
		}
		System.out.println(sum);
	}

	static void oneToTenMultipliedFor() {

		int sum = 1;

		for (int i = 1; i <= 10; i++) {

			sum *= i;

		}
		System.out.println(sum);
	}

	static void oneToTenMultipliedWhile() {

		int sum = 1;
		int i = 1;

		while (i <= 10) {

			sum *= i;
			i++;

		}
		System.out.println(sum);
	}

	static void selfMultiplied() {

		int sum = 1;

		for (int i = 1; i <= 10; i++) {

			sum = i * i;

			System.out.print(sum + "\t");

		}
		System.out.println();

	}

	static void noFour() {

		for (int i = 1; i <= 49; i++) {

			if (i % 10 != 4 && i / 10 % 10 != 4) {

				System.out.print(i + "\t");

			}
		}
		System.out.println();
	}

	static void tenTriangle() {

		for (int i = 10; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}

			System.out.println('\n');

		}
	}

	static void aBCDEF() {
		
		for (char uni = 'A'; uni <= 'F'; uni++) {
			
			for (int i = 65; i <= uni; i++) {
				
				System.out.print(uni);
				
			}
			
			System.out.println('\n');
			
		}
	}

	public static void main(String[] args) {

		evenAdd();
		oneToTenMultipliedFor();
		oneToTenMultipliedWhile();
		selfMultiplied();
		noFour();
		tenTriangle();
		aBCDEF();
	}

}
