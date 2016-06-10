package Tree;

/*Given an arbitrary binary tree, convert it to a binary tree that holds Children Sum Property. 
 * You can only increment data values in any node (You cannot change structure of tree and 
 * cannot decrement value of any node).
*/
public class ConvertBTToChildreSum {
	public static void main(String[] args) {
		Node root = new Node(50);
		Node left = new Node(7);
		Node right =  new Node(2);
		root.setLeft(left);
		root.setRight(right);
		
		Node left1 = new Node(3);
		Node right1 = new Node(5);
		left.setLeft(left1);
		left.setRight(right1);
		
		Node left2 = new Node(1);
		Node right2 = new Node(30);
		right.setLeft(left2);
		right.setRight(right2);
		
		System.out.println("Tree before:");
		MirrorTree.inOrder(root);
		System.out.println("Children Sum Property:"+ChildrenSumProperty.checkChildrenSum(root));		
		System.out.println("After Conversion");
		convertBTToChildreSum(root);
		MirrorTree.inOrder(root);
		System.out.println("Children Sum Property:"+ChildrenSumProperty.checkChildrenSum(root));
	}
	private static void convertBTToChildreSum(Node node){
		Node temp = new Node(0);
		if(node == null || (node.getLeft() == null && node.getRight() == null)){
			return;
		}
		convertBTToChildreSum(node.getLeft());
		convertBTToChildreSum(node.getRight());
		
		if(node.getLeft() == null){
			node.setLeft(temp);
		}
		if(node.getRight() == null){
			node.setRight(temp);
		}
		int diff = node.getData() - (node.getLeft().getData() + node.getRight().getData());
		if(diff == 0){
			return;
		}
		if(diff > 0){
			node.getLeft().setData(node.getData() - node.getRight().getData());
			convertBTToChildreSum(node.getLeft());
			convertBTToChildreSum(node.getRight());
		}
		if(diff < 0){
			node.setData(node.getLeft().getData() + node.getRight().getData());
			return;
		}		
	}
}
