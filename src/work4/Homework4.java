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

	private static void reverseString() {

		Scanner string = new Scanner(System.in);
		System.out.print("請輸入一個要反轉的字串：");

		String original = string.next();
		String reverse = new StringBuilder(original).reverse().toString();

		System.out.print(reverse);

	}

	private static void equals() {

		String[] planets = { "m","e","r", "c", "u", "r", "y", "v","e", "n", "u", "s", "e", "a", "r", "t", "h", "m", "a", "r", "s", "j", "u", "p", "i", "t", "e", "r", "s", "a", "t", "u", "r", "n", "u", "r", "a", "n", "u", "s", "n", "e", "p", "t", "u", "n", "e" };
		String[] vows = { "a", "e", "i", "o", "u" };
		int count = 0;

		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < 5; j++) {
				
				if(planets[i].contains(vows[j])){
					count++;
				}
			}
		}System.out.println(count);
	}
	
	private static void loan() {
		
		int[][] arr = {
				{25,2500},
				
		};
				
	

	public static void main(String[] args) {

		Homework4 Hw4 = new Homework4();

		Hw4.averageGreater();
		Hw4.reverseString();
		Hw4.equals();

	}
}
