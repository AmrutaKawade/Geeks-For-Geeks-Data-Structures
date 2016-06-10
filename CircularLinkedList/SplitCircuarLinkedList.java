package CircularLinkedList;

import LinkedList.Node;

public class SplitCircuarLinkedList {
	static Node head,head1,head2;
	public static void main(String[] args) {
		head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		
		head.setNode(first);
		first.setNode(second);
		second.setNode(third);
		third.setNode(fourth);
		fourth.setNode(head);
		
		printList(head);
		
		splitList();
		
		printList(head1);
		printList(head2);
	}
	
	private static void printList(Node node) {
		Node start = node;
		do{
			System.out.println(node.getData()+"\t");
			node = node.getNode();
		}while(node != start);
		System.out.println("\n");
	}	
	
	private static void splitList() {
		Node slowPtr = head;
		Node fastPtr = head;
		do{
			slowPtr = slowPtr.getNode();
			fastPtr = fastPtr.getNode().getNode();
		}while(fastPtr.getNode() != head);
		
		head1 = head;
		head2 = slowPtr.getNode();
		
		fastPtr.setNode(head2);
		slowPtr.setNode(head1);
	}
}
