package week3.day1;

public class Calculator {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	private float add(float x, float y) {
		System.out.println(x+y);
		return x+y;
	}
	
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	
	public void add(double a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, double b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(1.5,11.5);
		cal.add(12, 13);
		cal.add(10, 1.5);
		cal.add(1.5, 10);
		cal.add(10.3f, 10.7f);

	}

}
