package Graphs;
import java.util.*;

public class BFS {

	private int maxVertices;
	private LinkedList<Integer> adj[];
	
	public BFS(int vertices){
		maxVertices = vertices;
		adj = new LinkedList[maxVertices];
		for(int i=0;i<maxVertices;i++){
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	public void bfs(int s){
		boolean visited[] = new boolean[maxVertices];
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(!queue.isEmpty()){
			int v = queue.poll();
			System.out.print(v+ " ");
			Iterator<Integer> i = adj[v].listIterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BFS g = new BFS(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.bfs(1);

	}

}
