import java.util.LinkedList;
/*
 * Java code for implementing weighted directed graph.
 * Author: Komal Soham Wadekar
 */
public class WeightedDirectedGraph {

	int vertices;
	LinkedList<Node> listArr[];
	
	class Node{
		int vertex;
		int weight;
		
		public Node(int vertex, int weight){
			this.vertex = vertex;
			this.weight = weight;
		}
	}
	
	public WeightedDirectedGraph(int vertices){
		this.vertices = vertices;
		listArr = new LinkedList[vertices];
		for(int i=0; i<vertices; i++){
			listArr[i] = new LinkedList<Node>();
		}
	}
	
	public void addEdge(int src, int dest, int weight){
		Node node = new Node(dest, weight);
		listArr[src].add(node);
	}
	
	public void printGraph(WeightedDirectedGraph graph){
		for(int i=0; i< graph.vertices; i++){
			LinkedList<Node> list = graph.listArr[i];
			for(int j=0; j<list.size(); j++){
				System.out.println("Vertex "+i+" is connected to vertex "+list.get(j).vertex+
						" with wight "+list.get(j).weight);
			}
		}
	}
	
	public static void main(String args[]){
		WeightedDirectedGraph wdg = new WeightedDirectedGraph(5);
		
		wdg.addEdge(0, 1, 9);
		wdg.addEdge(0, 2, 6);
		wdg.addEdge(0, 3, 5);
		wdg.addEdge(0, 4, 3);
		wdg.addEdge(2, 1, 2);
		wdg.addEdge(2, 3, 4);
		
		wdg.printGraph(wdg);
		
	}
	
}
