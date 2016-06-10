package CircularLinkedList;

import LinkedList.Node;

public class AddToSortedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(4);
		Node third = new Node(5);
		Node fourth = new Node(6);
		
		head.setNode(first);
		first.setNode(second);
		second.setNode(third);
		third.setNode(fourth);
		fourth.setNode(head);
		
		addToSortedList(null,7);
	}

	private static void addToSortedList(Node node,int key) {
		Node start = node;
		//if list is empty
		if(node == null){
			start = new Node(key);
			start.setNode(start);
		}
		//insert at start of linked list
		else if(node.getData() >=key){
			Node prevPtr = null;
			do{
				prevPtr = node;
				node = node.getNode();
			}while(node != start);
			Node temp = new Node(key);
			temp.setNode(node);
			prevPtr.setNode(temp);
			start = temp;
		}
		/*New node is to be  inserted somewhere after the head: */
		else{			
			Node ptr = node;
			Node prevPtr = node;
			do{
				if(ptr.getData() < key){
					prevPtr = ptr;
					ptr = ptr.getNode();
				}
				else
					break;
			}while(ptr != start);
			Node temp = new Node(key);
			temp.setNode(ptr);
			prevPtr.setNode(temp);
		}		
		traverse(start);
	}
	private static void traverse(Node node) {
		Node start = node;
		do{
			System.out.println(node.getData());
			node = node.getNode();
		}while(node != start);
	}	
}
