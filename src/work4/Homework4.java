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

	private int[] dayDayInput() {
		System.out.println("請輸入yyyy年mm月dd日");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String nian = input.substring(0, 4);
		String yue = input.substring(4, 6);
		String ri = input.substring(6, 8);

		int year = Integer.parseInt(nian);
		int month = Integer.parseInt(yue);
		int day = Integer.parseInt(ri);

		int[] date = { year, month, day };

		return date;

	}

	private boolean dayDayCheck(int[] date) {

		switch (date[1]) {// date[1]是month

		case 1, 3, 5, 7, 8, 10, 12:

			return date[2] > 31;

		case 4, 6, 9, 11:

			return date[2] > 30;

		case 2:
			if (date[0] % 4 == 0) {// date[0]是year

				return date[2] > 29;
			}
		}
		return date[2] > 28;
	}

	private int dayDaySum(int[] date) {

		int sum = 0;

		for (int i = 1; i <= date[1] - 1; i++) {// date[1]是month

			switch (i) {
			case 1, 3, 5, 7, 8, 10, 12:

				sum += 31;
				break;

			case 4, 6, 9, 11:

				sum += 30;
				break;

			case 2:

				if (date[0] % 4 == 0) {// date[0]是year
					sum += 29;
				} else
					sum += 28;
				break;

			}
		}

		sum += date[2]; // date[2]是day
		return sum;

	}

	private void dayDay() {

		int[] date = dayDayInput();

		int sum = 0;

		if (dayDayCheck(date)) {

			System.out.println("日期格式錯誤，請重新輸入");
			dayDay();

		} else {

			sum = dayDaySum(date);
			System.out.println("該日期是當年的第 " + sum + " 天。");

		}

	}

	private static void max() {

		int[][] studentscore = { { 1, 2, 3, 4, 5, 6, 7, 8 }, 
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, 
				{ 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, 
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] studentmaxtimes = new int[8];

		for (int i = 1; i < 7; i++) {
			
			int maxvalue = studentscore[i][0];
			int maxindex = 0;

			for (int j = 0; j < 8; j++) {

				if (studentscore[i][j] > maxvalue) {
					maxvalue = studentscore[i][j];
					maxindex = studentscore[0][j-1];
				}
			}
			studentmaxtimes[maxindex]++;
		}
		for (int k = 0; k < 8; k++) {
			System.out.print(studentmaxtimes[k] + "\t");
		}
	}

	public static void main(String[] args) {

		Homework4 Hw4 = new Homework4();

		Hw4.averageGreater();
		Hw4.reverseString();
		Hw4.equals();
		Hw4.loan();
		Hw4.dayDay();
		Hw4.max();

	}
}
