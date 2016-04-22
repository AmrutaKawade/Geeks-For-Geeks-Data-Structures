package linkedList;

public class MiddleOfLinkedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		
		head.setNode(first);
		first.setNode(second);
		second.setNode(third);
		third.setNode(fourth);
		
		middleOfLinkedList(head);
	}
	private static void middleOfLinkedList(Node head){
		Node slowPtr =  head;
		Node fastPtr = head;
		while(fastPtr != null && fastPtr.getNode() != null){
			fastPtr = fastPtr.getNode().getNode();
			slowPtr = slowPtr.getNode();
		}
		System.out.println("Middle Element is:"+slowPtr.getData());
	}
}
