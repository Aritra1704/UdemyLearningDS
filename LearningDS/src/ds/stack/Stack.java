package ds.stack;

public class Stack {

	private int maxSize = 0;
	private long[] stackArray;
	private int top;
	private char[] text;
	
//	public Stack(int size) {
//		this.maxSize = size;
//		this.stackArray = new long[maxSize];
//		this.top = -1;
//	}
	
	public Stack(int size) {
		this.maxSize = size;
		this.text = new char[maxSize];
		this.top = -1;
	}
	
	public boolean push(long val) {
		if(!isFull()) {
			top++;
			stackArray[top] = val;
			return true;
		} else {
			System.out.println("Stack is full.");
			return false;
		}
	}
	
	public boolean pushChar(char charVal) {
		if(isFull()) {
			System.out.println("Stack is full.");
			return false;
		} else {
			top++;
			text[top] = charVal;
			return true;
		}
	}
	
	public long pop() {
		if(!isEmpty()) {
			int old_top = top;
			top--;
			return stackArray[old_top];	
		} else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}
	
	public char popChar() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return 'O';
		} else {
			int old_top = top;
			top--;
			return text[old_top];
		}
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public long peekChar() {
		return text[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return ((maxSize - 1) == top);
	}
}

