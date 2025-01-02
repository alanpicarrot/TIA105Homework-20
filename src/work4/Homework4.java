package work4;

import java.util.Scanner;

public class Homework4 {

	private void averageGreater() {

		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;

		int avg = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}
		avg = sum / array.length;
		System.out.println("平均值為：" + avg);

		System.out.print("大於平均值的值有：");

		for (int j = 0; j < array.length; j++) {

			if (array[j] > avg) {

				System.out.print(array[j] + "\t");

			}

		}

	}

	private void reverseString() {

		Scanner string = new Scanner(System.in);
		System.out.print("請輸入一個要反轉的字串：");

		String original = string.next();
		String reverse = new StringBuilder(original).reverse().toString();

		System.out.print(reverse);
		string.close();
	}

	private void equals() {

		String[] planets = { "m", "e", "r", "c", "u", "r", "y", "v", "e", "n", "u", "s", "e", "a", "r", "t", "h", "m",
				"a", "r", "s", "j", "u", "p", "i", "t", "e", "r", "s", "a", "t", "u", "r", "n", "u", "r", "a", "n", "u",
				"s", "n", "e", "p", "t", "u", "n", "e" };
		String[] vows = { "a", "e", "i", "o", "u" };
		int count = 0;

		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < 5; j++) {

				if (planets[i].contains(vows[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private void loan() {

		int[][] arr = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		
		System.out.print("請輸入要借多少錢：");
		
		Scanner sc = new Scanner(System.in);
		int loan = (int) sc.nextInt();
		int count = 0;
		
		System.out.print("有錢可借的員工編號：");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i][j] > loan) {
					
					System.out.print(arr[0][j] + "\t");
					count++;

				}
			}
		}
		System.out.print("共" + count + "人！");
		sc.close();
	}
	
	private void day() {
		System.out.println("請輸入yyyy年mm月dd日");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
	}
	
	private static void max() {
		
	}

	public static void main(String[] args) {

		Homework4 Hw4 = new Homework4();

		Hw4.averageGreater();
		Hw4.reverseString();
		Hw4.equals();
		Hw4.loan();
		Hw4.day();
//		Hw4.max();

	}
}
