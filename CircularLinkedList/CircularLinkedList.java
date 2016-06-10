package CircularLinkedList;

public class CircularLinkedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = new Node(2);
		Node third = new Node(3);
		head.setNode(first);
		first.setNode(third);
		third.setNode(head);
		
		traverse(head);
	}

	private static void traverse(Node node) {
		Node start = node;
		do{
			System.out.println(node.getData());
			node = node.getNode();
		}while(node != start);
	}	
}
