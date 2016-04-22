package tree;


public class ChildrenSumProperty {
	public static void main(String[] args) {
		Node root = new Node(10);
		Node left = new Node(8);
		Node right =  new Node(2);
		Node rightLeft = new Node(2);
		right.setLeft(rightLeft);
		root.setLeft(left);
		root.setRight(right);
		Node left1 = new Node(3);
		Node right1 = new Node(5);
		left.setLeft(left1);
		left.setRight(right1);
		
		System.out.println("Children Sum Property:"+checkChildrenSum(root));
	}
	public static boolean checkChildrenSum(Node node){
		Node temp = new Node(0);
		if(node == null || (node.getLeft() == null && node.getRight() == null)){
			return true;
		}
		if(node.getLeft() == null){
			node.setLeft(temp);
		}
		if(node.getRight() == null){
			node.setRight(temp);
		}
		if(node.getData() == (node.getLeft().getData()+node.getRight().getData())
				&& checkChildrenSum(node.getLeft())
				&& checkChildrenSum(node.getRight())){
			return true;
		}
		return false;		
	} 
}
