package geeksForGeeks;
//Size = Number of nodes in tree
public class SizeOfTree {
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
		System.out.println("Size"+size(root));
	}
	
	private static int size(Node node){
		if(node == null){
			return 0;
		}
		else{
			return (size(node.getLeft()) + 1 + size(node.getRight()));
		}
	}
}
