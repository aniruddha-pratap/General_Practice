package Graphs;

public class Edge{
	int u;
	public Edge(int u){
		this.u=u;
	}
	@Override
	public String toString(){
		return "["+u+"]";
	}
}