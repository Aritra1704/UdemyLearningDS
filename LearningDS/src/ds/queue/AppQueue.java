package ds.queue;

public class AppQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que = new Queue(5);
		que.insert(100);
		que.insert(200);
		que.insert(300);
		que.insert(400);
		que.insert(500);
		
		que.view();
	}

}
