package Graphs;
import java.util.*;

public class AdjacencyList {

	List<Edge> G[];
	
	@SuppressWarnings("unchecked")
	public AdjacencyList(int vertexCount){
		G = new LinkedList[vertexCount];
		for(int i=0;i<vertexCount;i++){
			G[i]= new LinkedList<Edge>();
		}
	}
	
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<G.length;i++){
			result = result+i+"==>"+G[i]+"\n";
		}
		return result;
	}
	
	public void addEdge(int source, int destination){
		G[source].add(0,new Edge(destination));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjacencyList l = new AdjacencyList(5);
		l.addEdge(0, 1);
		l.addEdge(0, 5);
		l.addEdge(1, 5);
		System.out.println(l);
	}

}
