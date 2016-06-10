package Tree;
//Two trees are identical when they have same data and arrangement of data is also same.
public class IdenticalTrees {
	public static void main(String[] args) {
		Node root = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		root.setLeft(left);
		root.setRight(right);
		Node left1 = new Node(4);
		Node right1 = new Node(5);
		left.setLeft(left1);
		left.setRight(right1);
		
		Node root1 = new Node(1);
		Node left11 = new Node(2);
		Node right11 = new Node(3);
		root1.setLeft(left11);
		root1.setRight(right11);
		Node left12 = new Node(4);
		Node right12 = new Node(5);
		left11.setLeft(left12);
		left11.setRight(right12);
		
		System.out.println("Identical Trees "+ identicalTrees(root,root1));
	}
	private static boolean identicalTrees(Node node1,Node node2){
		if(node1 == null && node2  == null){
			return true;
		}
		if(node1 != null && node2  != null){	
			return (node1.getData() == node2.getData() 
					&& identicalTrees(node1.getLeft(),node2.getLeft())
					&& identicalTrees(node1.getRight(),node2.getRight()));
		}
		return false;
	}
}
