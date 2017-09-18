package ds.graph;

import java.util.ArrayList;

public class BetterGraph {

	private int vCount;
	private String graphType;
	private Vertex[] arrayOfVertex;
	private int vertexCount = 0;
	
	public BetterGraph(int vCount, String graphType) {
		this.vCount = vCount;
		this.graphType = graphType;
		
		arrayOfVertex = new Vertex[vCount];
	}
	
	class Vertex {
		String name;
		Node adList;
		Vertex(String name, Node aNode) {
			this.name = name;
			this.adList = aNode;
		}
	}
	
	public void addVertex(String name) {
		arrayOfVertex[vertexCount++] = new Vertex(name, null);
	}
	
	public void addEdge(String vertex, String road) {
		for(int i = 0; i < vCount; i++) {
			if(arrayOfVertex[i].name.equalsIgnoreCase(vertex)) {
				if(arrayOfVertex[i].adList == null) {
					Node node = new Node();
					node.value = road;
					node.next = null;
					arrayOfVertex[i].adList = node;	
				} else {
					Node node = arrayOfVertex[i].adList;
					while(node.next != null)
						node = node.next;
					node.next = new Node();
					node = node.next;
					node.value = road;
					node.next = null;
				}
				break;
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < vCount; i++) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append(arrayOfVertex[i].name);
			
			Node node = arrayOfVertex[i].adList;
			if(node != null) {
				strBuilder.append(" --> ");
				strBuilder.append(node.value);
				
				 while(node.next != null) {
					node = node.next;
					strBuilder.append(" --> ");
					strBuilder.append(node.value);
				}
			}
			System.out.println(strBuilder.toString());
		}
	}
}
