package LinkedList;
/*Given Linkedlist e.g 1-2-3-4-5-6, make
the following changes 1-6-2-5-3-4*/
public class MergeAlternate {
	static Node head;
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
		
		printList(head);
		reverseLinkedList();
		printList(head);
		//mergeAlternateElements();
	}
	private static void printList(Node node){
		while(node != null){
			System.out.print(node.getData()+"\t");
			node = node.getNode();
		}
		System.out.println("\n");
	}
	//Reverse Linked List
	public static void reverseLinkedList(){
			Node prev = null;
			Node current = head;
			Node next = null;
			while(current != null){
				next = current.getNode();
				current.setNode(prev);
				prev = current;
				current = next;
			}
			head = prev;
	}
	/*//Merge Alternate Elements
	public static void mergeAlternateElements(){
		//LinkedList2
		Node prev = null;
		Node current = head.getNode();
		Node next = null;
		while(current != null && current.getNode() != null){
			next = current.getNode().getNode();
			current.setNode(prev);
			prev = current;
			current = next;
		}
		Node shead = prev;
		printList(shead);
		printList(head);
	}*/
}
