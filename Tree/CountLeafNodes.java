package tree;


public class CountLeafNodes {
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
		
		int a = leafNodes(root);
		System.out.println("leaf nodes:"+a);
	}
	private static int leafNodes(Node node){
		if(node == null)
			return 0;
		if(node.getLeft() == null && node.getRight()==null)
			return 1;
		else{
			return leafNodes(node.getLeft()) + leafNodes(node.getRight());
		}
	}
}
