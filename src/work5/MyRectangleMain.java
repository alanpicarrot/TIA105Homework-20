package work5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		MyRectangle re = new MyRectangle();
		re.setWidth(10);
		re.setDepth(20);
		System.out.println(re.getArea());
		
		MyRectangle re2 = new MyRectangle(10,20);
		System.out.println(re2.getArea());
	}

}
