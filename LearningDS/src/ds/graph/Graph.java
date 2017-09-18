package ds.graph;

import java.util.ArrayList;

public class Graph {

	private int vCount;
	private int eCount;
	
	private ArrayList[] arrAdjacents;
	
	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		arrAdjacents = new ArrayList[vCount];
		
		for(int i = 0; i < vCount; i++) {
			arrAdjacents[i] = new ArrayList();
		}
	}
	
	public int getVersionCount() {
		return vCount;
	}
	
	public int getEdgeCount() {
		return eCount;
	}
	
	public void addEdge(int src, int dest) {
		arrAdjacents[src].add(dest);
		eCount++;
	}
	
	public Object[] adj(int src) {
		return arrAdjacents[src].toArray();
	}
}
