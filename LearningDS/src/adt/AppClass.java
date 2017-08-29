package adt;

public class AppClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter("myCounter");
		
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		
		System.out.println(myCounter.getCurrentValue() + "");
	}

}
