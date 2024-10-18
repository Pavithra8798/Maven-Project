package week1.day2;

import java.util.*;

public class Fibonacci {
	public static void isFibonacci(int range) {
		int first=0,second=1,third;
		System.out.println(first+"\n"+second);
		//System.out.println(second);
		for(int i=2;i<=range;i++) {
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
	}
	public static void main(String[] args) {
		Fibonacci fibo=new Fibonacci();
		Scanner scanner=new Scanner(System.in);
		int range=scanner.nextInt();
		isFibonacci(range);
		
	}
}
