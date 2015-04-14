package linkedList;

public class LengthOfLinkedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = new Node(2);
		Node third = new Node(3);
		
		head.setNode(first);
		first.setNode(third);
		
		int iter = lengthIterative(head);
		System.out.println("Iterative:"+iter);
		
		int recur = lengthRecursive(head);
		System.out.println("Recurrsive:"+recur);
	}
	private static int lengthIterative(Node node){
		int count = 0;
		while(node != null){
			node = node.getNode();
			count++;
		}
		return count;
	}
	private static int lengthRecursive(Node node){
		if(node == null){
			return 0;
		}
		return 1 + lengthRecursive(node.getNode());
	}
}
