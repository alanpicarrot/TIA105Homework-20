package work5;

import java.util.Scanner;

class Square {

	private int width;
	private int height;

	public Square() {

	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void starSquare() {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

class MyRectangle {
	private double width;
	private double depth;

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		return width * depth;
	}
}

public class Homework5 {

	public static void ex1Square() {

		Square sq = new Square();

		System.out.println("請輸入長方形寬度");
		Scanner sc = new Scanner(System.in);
		sq.setWidth(sc.nextInt());

		System.out.println("請輸入長方形高度");
		Scanner sc2 = new Scanner(System.in);
		sq.setHeight(sc.nextInt());

		sq.starSquare();

		sc.close();
		sc2.close();

	}

	public static void ex2RandAvg() {

		int[] pick = new int[10];

		int sum = 0;

		int avg = 0;

		System.out.println("本次亂數結果：");

		for (int i = 0; i < 10; i++) {
			pick[i] = (int) (Math.random() * 101);
			System.out.print(pick[i] + "\t");
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			sum += pick[i];
		}
		avg = sum / 10;
		System.out.println(avg);
	}

	static int maxElement(int x[][]) {

		int max = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	static double maxElement(double x[][]) {

		double max = 0.0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;

	}

	static void genAuthCode() {

		char[] table = {//char a = 56;
				
				'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
				
		};
		
		char[] auth = new char[8];

		for (int i = 0; i < 8; i++) {

			int index = (int) (Math.random() * 62);
			auth[i] = table[index];
			

		}
		String result = new String(auth);
		System.out.println("本次隨機驗證碼為：" + result);
	}

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		ex1Square();
		ex2RandAvg();
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));
		
		genAuthCode();
		
		

		

	}

}
