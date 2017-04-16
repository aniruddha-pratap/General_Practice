package Graphs;
import java.util.*;

public class DFSAdjMatrix {

	class Vertex{
		public int label;
		public boolean visited;
		public Vertex(int label){
			this.label = label;
			visited = false;
		}
	}
	
	private int maxVertices;
	private int adjMatrix[][];
	private Stack<Integer> s;
	private Vertex vertices[];
	private int vertexCount;
	
	public DFSAdjMatrix(int noOfvertices){
		maxVertices = noOfvertices;
		vertices = new Vertex[maxVertices];
		vertexCount =0;
		adjMatrix = new int[maxVertices][maxVertices];
		for(int i=0;i<maxVertices;i++){
			for(int j=0;j<maxVertices;j++){
				adjMatrix[i][j]=0;
			}
		}
		s=new Stack<Integer>();
	}
	
	public void addVertex(int v){
		vertices[vertexCount++]=new Vertex(v);
	}
	
	public void addEdge(int v, int w){
		adjMatrix[v][w]=1;
		adjMatrix[w][v]=1;
	}
	
	public void DFS(){
		vertices[0].visited=true;
		System.out.print(vertices[0].label+" ");
		s.push(0);
		while(!s.isEmpty()){
			int v = getAdjUnvisitedNode(s.peek());
			if(v==-1){
				s.pop();
			}else{
				vertices[v].visited=true;
				System.out.print(vertices[v].label+" ");
				s.push(v);
			}
		}
	}
	
	public int getAdjUnvisitedNode(int v){
		for(int j=0;j<maxVertices;j++){
			if(adjMatrix[v][j]==1 && vertices[j].visited==false){
				return j;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		DFSAdjMatrix g = new DFSAdjMatrix(4);
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("Following is Depth First Traversal");
        
        g.DFS();
	}

}
