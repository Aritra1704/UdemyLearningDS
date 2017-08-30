package ds.doublylinkedlist;

public class AppDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList myList = new DoublyLinkedList();
		myList.insertFirst(40);
		myList.insertFirst(50);
		myList.insertFirst(60);
		myList.insertFirst(70);
		myList.displayForward();
		myList.displayBackward();
		
		myList.deleteFirst();
		myList.deleteLast();
		myList.deleteKey(50);
		myList.displayForward();
		
		myList.insertAfter(60, 55);
		myList.insertAfter(55, 75);
		
		myList.displayForward();
	}

}
