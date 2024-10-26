package week3.day1;

public class Polymorphism {
	public void reportStep(String msg,String status ) {
		System.out.println(msg+"\n"+status);
	}
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg+"\n"+status+"\n"+snap);
	}

}
