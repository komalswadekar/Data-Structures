/*
*Java Code for adjacency list representation of graph
* Author : Komal Wadekar
*/
import java.util.LinkedList;

public class GraphUsingAdjacencyList {

	int vertices;
	LinkedList<Integer> listArray[];
	public GraphUsingAdjacencyList(int vertices) {
		this.vertices = vertices;
		listArray = new LinkedList[vertices];
		for(int i=0; i<listArray.length;i++){
			listArray[i] = new LinkedList<>();
		}
	}
	
	void addEdge(GraphUsingAdjacencyList graph, int source, int destination){
		 listArray[source].add(destination);
	}
	
	void printGraph(GraphUsingAdjacencyList graph){
		
		for(int i=0; i<graph.listArray.length; i++){
			System.out.println("Adjacency list for vertex "+i);
			LinkedList<Integer> list = graph.listArray[i];
			System.out.print("head");
			for(int j=0; j<list.size();j++){
				System.out.print("-->");
				System.out.print(list.get(j));				
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		GraphUsingAdjacencyList graph = new GraphUsingAdjacencyList(5);
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
