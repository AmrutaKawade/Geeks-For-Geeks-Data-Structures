package geeksForGeeks;
//Where a NULL right pointers is made to point to the inorder successor (if successor exists)
public class SingleThreadedTree {
	public static void main(String[] args) {
		Node root = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		root.setLeft(left);
		root.setRight(right);
		Node left1 = new Node(4);
		left1.setRightThread(true);
		left1.setRight(left);
		Node right1 = new Node(5);
		right1.setRightThread(true);
		right1.setRight(root);
		left.setLeft(left1);
		left.setRight(right1);	
		System.out.println("Inorder");
		inOrderTraversal(root);
	}
	private static Node getLeftMost(Node node){
		if(node == null){
			return null;
		}
		while(node.getLeft() != null){
			node = node.getLeft();
		}
		return node;
	}
	private static void inOrderTraversal(Node node){
		//get left most node
		Node current = getLeftMost(node);
		while(current != null){
			System.out.println(current.getData());
			//if node has inorder successor get it
			if(current.isRightThread()){
				current = current.getRight();
			}
			//else get left most node of right child of node
			else{
				current = getLeftMost(current.getRight());
			}
		}
	}
}
