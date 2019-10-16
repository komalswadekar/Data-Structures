/*
 * Java code for adjacency matrix representation of graph
 * Author: Komal Soham Wadekar
 */
public class GraphUsingAdjacencyMatrix {

	int vertices;
	int graphMatrix[][];
	
	public GraphUsingAdjacencyMatrix(int vertices){
		this.vertices = vertices;
		graphMatrix = new int[vertices][vertices];
	}
	
	public void addEdge(GraphUsingAdjacencyMatrix graph, int source, int dest){
		graphMatrix[source][dest] = 1;
	}
	
	void printGraph(GraphUsingAdjacencyMatrix graph){
		for(int i=0; i<vertices;i++){
			for (int j=0;j<vertices;j++){
				System.out.print(graphMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		GraphUsingAdjacencyMatrix graph = new GraphUsingAdjacencyMatrix(5);
		graph.addEdge(graph, 0, 1);
		graph.addEdge(graph, 0, 4);
		graph.addEdge(graph, 1, 0);
		graph.addEdge(graph, 1, 4);
		graph.addEdge(graph, 1, 3);
		graph.addEdge(graph, 1, 2);
		graph.addEdge(graph, 2, 1);
		graph.addEdge(graph, 2, 3);
		graph.addEdge(graph, 3, 1);
		graph.addEdge(graph, 3, 4);
		graph.addEdge(graph, 3, 2);
		graph.addEdge(graph, 4, 0);
		graph.addEdge(graph, 4, 1);
		graph.addEdge(graph, 4, 3);
		
		graph.printGraph(graph);
	}

}
