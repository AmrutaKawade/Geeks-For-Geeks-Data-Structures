package geeksForGeeks;


public class DepthOfTree {
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
		
		System.out.println("Depth"+depth(root));
	}
	private static int depth(Node node){
		if(node == null){
			return 0;
		}
		else{
			return (max(depth(node.getLeft()),depth(node.getRight()))+1);
		}
	}
	private static int max(int a,int b){
		if(a>b){
			return a;
		}
		else if(b>a){
			return b;
		}else{
			return a;
		}
	}
}
