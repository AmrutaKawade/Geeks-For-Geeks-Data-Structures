package Graphs;

import java.util.LinkedList;
import java.util.ListIterator;

class Graph1{
	private int V;
	private LinkedList[] adj;
	
	public Graph1(int v){
		V = v;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
	}
	public void DFS(int n){
		boolean visited[] = new boolean[V];
		DFSUtil(n,visited);
	}

	private void DFSUtil(int node, boolean[] visited) {
		visited[node] = true;
		System.out.println(node);
		ListIterator list = adj[node].listIterator();
		while(list.hasNext()){
			int n = (int) list.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
	}
}
public class DepthFirstTraversal {
	public static void main(String[] args) {
		Graph1 g = new Graph1(4);	
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.DFS(2);
	}
}
