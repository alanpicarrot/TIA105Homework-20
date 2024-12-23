package work1;

public class Homework1 {

	static void addMul() {

		int add = 12 + 6;
		int mul = 12 * 6;
		System.out.println(add);
		System.out.println(mul);

	}

	static void daKe() {
		int egg = 200;
		int da = 200 / 12;
		int ke = 200 % 12;
		System.out.println(egg + "顆蛋共是" + da + "打" + ke + "顆蛋");
	}

	static void dayHourMinSec() {
		int sec = 256559;
		int day = sec / (24 * 3600);
		int dayRemainder = sec % (24 * 3600);
		int hour = dayRemainder / 3600;
		int hourRemainder = dayRemainder % 3600;
		int min = hourRemainder / 60;
		int secRemainder = hourRemainder % 60;
		System.out.println(sec + "秒等於" + day + "天" + hour + "時" + min + "分" + secRemainder + "秒");

	}

	static void round() {
		double pi = 3.1415;
		int radius = 5;
		double roundArea = pi * radius * radius;
		double roundLength = 2 * pi * radius;
		System.out.println("圓面積等於" + roundArea + "," + "圓周長等於" + roundLength);
	}

	static void compoundInterest() {
		int pv = 1500000;
		double rate = 0.02;
		int year = 10;
		double fv = pv * Math.pow((1 + rate), year);
		System.out.println("本金加利息共" + fv + "元");
	}

	static void dataType() {
		System.out.println(5 + 5);
		System.out.println(5 + '5');// 整數5加上字元'5'的十進制表示值53等於整數58
		System.out.println(5 + "5");// 因包含字串"5"，整條指令視為字串串接，即5後面接5，結果為"55"。
	}

	public static void main(String[] args) {
		addMul();
		daKe();
		dayHourMinSec();
		round();
		compoundInterest();
		dataType();
	}

}
