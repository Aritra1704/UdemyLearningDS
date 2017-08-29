package ds.queue;

public class Queue {

	private int maxSize; //initializes a set number of slots
	private long[] queArray;//slots to maintain data
	private int front;//index position for the element in front
	private int rear;//index position for the element in rear
	private int nItems;//counter to maintain the number of items
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[maxSize];
		front = 0;//index position of the first slot of array
		rear = -1;//there are no items in the array yet to be considered as the last item
		nItems = 0;//no elements in array yet
	}
	
	public void insert(long value) {
		rear++;
		queArray[rear] = value;
		nItems++;
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
}
