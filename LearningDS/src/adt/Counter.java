package adt;

public class Counter {

	String name = null;
	int counterVal = 0;

	public Counter(String name) {
		super();
		this.name = name;
	}
	
	public void increment() {
		this.counterVal++;
	}
	
	public int getCurrentValue() {
		return counterVal;
	}
	
	public String toString() {
		return name + " : " + counterVal;
	}
}
