package geeksForGeeks;

public class BinaryTree {
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
		
		System.out.println("Inorder");
		inOrderTraversal(root);
		System.out.println("Preorder");
		preOrderTraversal(root);
		System.out.println("PostOrder");
		postOrderTraversal(root);
		
		System.out.println("Delete Tree:");
		deleteTree(root);
	}
	
	//Left-Node-Right
	private static void inOrderTraversal(Node node){
		if(node == null){
			return;
		}
		inOrderTraversal(node.getLeft());
		System.out.println(node.getData());
		inOrderTraversal(node.getRight());
	}

	// Node-Left-Right
	private static void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.getData());
		preOrderTraversal(node.getLeft());		
		preOrderTraversal(node.getRight());
	}

	// Left-Right-Node
	private static void postOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.getLeft());		
		postOrderTraversal(node.getRight());
		System.out.println(node.getData());
	}
	
	//delete tree use posttraversal
	private static void deleteTree(Node node){
		if (node == null) {
			return;
		}
		deleteTree(node.getLeft());		
		deleteTree(node.getRight());
		System.out.println(node.getData());
		node = null;
	}
}

