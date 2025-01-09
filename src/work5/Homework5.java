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
			System.out.print("\n");
		}

	}

}

public class Homework5 {

	public static void ex1() {

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

	public static void main(String[] args) {
		
		ex1();

	}

}
