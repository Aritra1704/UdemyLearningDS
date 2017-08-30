package ds.singlylinkedlist;

public class AppSingleLiskList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList mylist = new SinglyLinkedList();
		mylist.insertFirst(40);
		mylist.insertFirst(50);
		mylist.insertFirst(60);
		mylist.insertFirst(70);
		mylist.insertLast(90);
		
		mylist.displayList();
	}

}
