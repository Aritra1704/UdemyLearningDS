package ds.stack;

public class AppStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Stack newStack = new Stack(10);
//		newStack.push(10);
//		newStack.push(20);
//		newStack.push(30);
//		newStack.push(40);
//		newStack.push(50);
//		newStack.push(60);
//		newStack.push(70);
//		newStack.push(80);
//		newStack.push(90);
//		newStack.push(100);
//		newStack.push(110);
//		newStack.push(120);
//		
//		while(!newStack.isEmpty()){
//			long value = newStack.pop();
//			System.out.println("Pop : " + value);
//		}
		
		System.out.println(reverseString("HELLO"));
	}
	
	private static String reverseString(String str) {
		int maxSize = str.length();
		Stack stack = new Stack(maxSize);
		
		for(int i = 0; i < maxSize; i++) {
			stack.pushChar(str.charAt(i));
		}
		
		
		String revString = "";
		while(!stack.isEmpty()){
			revString += stack.popChar();
		}
		return revString;
	}

}
