package Tree;
import java.util.LinkedList;
import Tree.Node;
public class LevelOrderTraversal {
		static Node root;
		public static void levelOrderTraveral(Node node){
			LinkedList<Node> queue = new LinkedList<Node>();
			queue.add(node);
			while(!queue.isEmpty()){
				Node n = queue.poll();
				System.out.println(n.getData());
				if(n.getLeft() != null){
					queue.add(n.getLeft());
				}
				if(n.getRight() != null){
					queue.add(n.getRight());
				}
			}
		}
		public static void main(String[] args) {
			root = new Node(1);
			root.setLeft(new Node(2));
			root.setRight(new Node(3));
			root.getLeft().setLeft(new Node(4));
			root.getLeft().setRight(new Node(5));
			
			levelOrderTraveral(root);
		}
}
