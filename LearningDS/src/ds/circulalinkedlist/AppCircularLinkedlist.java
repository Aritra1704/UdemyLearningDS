package ds.circulalinkedlist;

import ds.singlylinkedlist.SinglyLinkedList;

public class AppCircularLinkedlist {

	public static void main(String[] args) {
		CircularLinkedList mylist = new CircularLinkedList();
		mylist.insertFirst(40);
		mylist.insertFirst(50);
		mylist.insertFirst(60);
		mylist.insertFirst(70);
		mylist.insertLast(90);
		
		mylist.displayList();
	}
}
