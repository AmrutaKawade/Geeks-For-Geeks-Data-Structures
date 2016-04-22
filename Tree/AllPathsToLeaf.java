package tree;

public class AllPathsToLeaf {
	public static void main(String[] args) {
		Node root = new Node(1);
		Node left = new Node(2);
		Node right =  new Node(3);
		root.setLeft(left);
		root.setRight(right);
		Node left1 = new Node(4);
		Node right1 = new Node(5);
		left.setLeft(left1);
		left.setRight(right1);
		
		int[] path = new int[1000];
		path(root, path, 0);
	}
	private static void path(Node node,int[] path, int pathlength){
		if(node == null){
			return;
		}
		path[pathlength] = node.getData();
		pathlength++;
		if(node.getLeft() == null && node.getRight() == null){
			printArray(path,pathlength);
		}
		else{
			path(node.getLeft(),path,pathlength);
			path(node.getRight(),path,pathlength);
		}
	}
	private static void printArray(int[] path,int pathlength) {
		for(int i=0;i<pathlength;i++){
			System.out.print(path[i]+"\t");
		}
		System.out.println("\n");
	}	
}
