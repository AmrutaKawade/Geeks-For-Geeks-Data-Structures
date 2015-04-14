package circularLinkedList;

import linkedList.Node;

public class SplitCircuarLinkedList {
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
		fourth.setNode(head);
		splitList(head);
	}

	private static void splitList(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		do{
			slowPtr = slowPtr.getNode();
			fastPtr = fastPtr.getNode().getNode();
		}while(fastPtr.getNode() != head);
		fastPtr.setNode(slowPtr.getNode());
		slowPtr.setNode(head);
		System.out.println("Slow:"+slowPtr.getData());
		System.out.println("Fast:"+fastPtr.getData());
	}
}
