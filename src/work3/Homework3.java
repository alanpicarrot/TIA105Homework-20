package work3;

import java.util.Scanner;

public class Homework3 {

	public static String isTriangle(int[] x) {

		if (x[0] == x[1] && x[1] == x[2] && x[0] == x[2]) {

			return "正三角形";

		} else if (x[0] == x[1] || x[1] == x[2]
				|| x[0] == x[2] && x[0] + x[1] > x[2] && x[1] + x[2] > x[0] && x[0] + x[2] > x[1]) {

			return "等腰三角形";

		} else if (Math.pow(x[0], 2) == Math.pow(x[1], 2) + Math.pow(x[2], 2)
				|| Math.pow(x[1], 2) == Math.pow(x[0], 2) + Math.pow(x[2], 2)
				|| Math.pow(x[2], 2) == Math.pow(x[0], 2) + Math.pow(x[1], 2)) {

			return "直角三角形";

		}

		else if (x[0] + x[1] > x[2] && x[1] + x[2] > x[0] && x[0] + x[2] > x[1]) {

			return "其它三角形";

		} else if (x[0] == 0 || x[1] == 0 || x[2] == 0) {

			return "不是三角形";

		} else
			return "不是三角形";

	}

	public static void printTriangle() {

		Scanner side = new Scanner(System.in);

		int[] x = new int[3];

		System.out.println("請輸入3個整數");

		for (int i = 0; i < 3; i++) {

			if (side.hasNextInt()) {

				x[i] = (int) side.nextInt();

			}
		}
		System.out.println(isTriangle(x));
		side.close();
	}

	public static void guessZeroToHundred() {

		int answer = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);

		System.out.println("請輸入一個0~100的數字");

		int guess = (int) input.nextInt();

		while (guess != answer) {

			if (guess < answer) {

				System.out.println("猜錯囉，答案更大，請繼續輸入");

				guess = (int) input.nextInt();

			} else if (guess > answer) {

				System.out.println("猜錯囉，答案更小，請繼續輸入");

				guess = (int) input.nextInt();

			} else
				break;
		}
		System.out.println("答對了，答案就是" + guess);
		input.close();
	}

	public static void lotto() {

		Scanner input = new Scanner(System.in);

		System.out.println("阿文...請輸入你討厭1~9的哪個數字？");

		int hate = (int) input.nextInt();

		for (int i = 1; i <= 49; i++) {

			if (i % 10 != hate && i / 10 % 10 != hate) {

				System.out.print(i + "\t");

			}
		}input.close();
	}

	public static void lottoSix() {

		Scanner input = new Scanner(System.in);

		System.out.println("阿文...你輸入討厭1~9的哪個數字？，我報給你6個OK的數字");

		int hate = (int) input.nextInt();

		int[] lotto = new int[6];

		while (lotto[5] == 0) {
			for (int i = 0; i < 6;) {

				int number = (int) ((Math.random() * 49) + 1);

				if (number % 10 != hate && (number / 10) != hate) {

					if (number != lotto[0] && number != lotto[1] && number != lotto[2] && number != lotto[3]
							&& number != lotto[4] && number != lotto[5]) {

						lotto[i] = number;
						i++;// 確定有放到數字才往下一個陣列索引
					}//如果不用上面的寫法，可以在這裡寫 else i--，即遇到不能放的數字，陣列索引要倒退一個重新找
				}
			}
		}
		for (int j = 0; j < 6; j++) {
			System.out.print(lotto[j] + "\t");
		}
		input.close();
	}

	public static void main(String[] args) {

		printTriangle();
		guessZeroToHundred();
		lotto();
		lottoSix();
	}
	
}
