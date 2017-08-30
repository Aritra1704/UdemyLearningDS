package ds.linklist;

public class AppLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node nodeA = new Node();
		nodeA.value = 4;
		
		Node nodeB = new Node();
		nodeB.value = 3;
		
		Node nodeC = new Node();
		nodeC.value = 7;
		
		Node nodeD = new Node();
		nodeD.value = 8;
		
		nodeA.refNode = nodeB;
		nodeB.refNode = nodeC;
		nodeC.refNode = nodeD;
		
		System.out.println(listLength(nodeA) + "");
	}
	
	public static int listLength(Node node) {
		int length = 0;
		Node curNode = node;
		while(curNode.refNode != null) {
			length++;
			curNode = curNode.refNode;
		}
		return length;
	}
}
