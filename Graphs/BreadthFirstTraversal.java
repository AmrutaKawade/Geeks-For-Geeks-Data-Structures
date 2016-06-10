package Graphs;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

class Graph{
	private int V;
	private LinkedList[] adj;
	public Graph(int nodes){
		V = nodes;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i] = new LinkedList();
		}
	}
	public void addEdge(int i, int j) {
		adj[i].add(j);
	}
	public void BFS(int i) {
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[i] = true;
		queue.add(i);
		
		while(!queue.isEmpty()){
			int node = queue.poll();
			System.out.println(node);
			ListIterator list = adj[node].listIterator();
			while(list.hasNext()){
				int n = (int) list.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}	
		}
	}
}
public class BreadthFirstTraversal {
	public static void main(String[] args) {
		Graph g = new Graph(4);	
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        g.BFS(2);
	}
}
