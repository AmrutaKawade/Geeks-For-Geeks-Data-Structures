package tree;

//Algorithm: do postOrder Traversal then swap nodes
public class MirrorTree {
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
		System.out.println("Tree before:");
		inOrder(root);
		System.out.println("Create Mirror");
		createMirrorTree(root);
		System.out.println("Tree after:");
		inOrder(root);
	}
	private static void createMirrorTree(Node node){
		if(node == null){
			return;
		}else{
			createMirrorTree(node.getLeft());
			createMirrorTree(node.getRight());
			Node temp = node.getRight();
			node.setRight(node.getLeft());
			node.setLeft(temp);
		}
	}
	public static void inOrder(Node node){
		if(node == null){
			return;
		}
		inOrder(node.getLeft());
		System.out.println(node.getData());
		inOrder(node.getRight());
	}
}
