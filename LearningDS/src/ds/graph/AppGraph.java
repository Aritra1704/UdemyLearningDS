package ds.graph;

public class AppGraph {

	public static void main(String[] args) {

//		Graph myGraph = new Graph(5);
//		myGraph.addEdge(0, 1);
//		myGraph.addEdge(0, 2);
//		myGraph.addEdge(0, 3);
//		myGraph.addEdge(1, 2);
//		myGraph.addEdge(1, 4);
//		myGraph.addEdge(2, 3);
//		myGraph.addEdge(3, 1);
//		myGraph.addEdge(4, 0);
//		myGraph.addEdge(4, 3);
//		
//		Object[] values = myGraph.adj(0);
//		for(Object val : values) {
//			System.out.println(val);
//		}
		
		BetterGraph myBetterGraph = new BetterGraph(5, "directed");
		myBetterGraph.addVertex("State");
		myBetterGraph.addVertex("Avenel");
		myBetterGraph.addVertex("Elm");
		myBetterGraph.addVertex("Pocono");
		myBetterGraph.addVertex("William");
		
		myBetterGraph.addEdge("Avenel", "Pocono");
		myBetterGraph.addEdge("State", "Elm");
		myBetterGraph.addEdge("Elm", "Avenel");
		myBetterGraph.addEdge("Elm", "William");
		myBetterGraph.addEdge("William", "State");
		myBetterGraph.addEdge("William", "Pocono");
		myBetterGraph.addEdge("Pocono", "Elm");
		myBetterGraph.addEdge("State", "Avenel");
		
		myBetterGraph.print();

	}

}
