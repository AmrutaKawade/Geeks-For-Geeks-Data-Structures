package LinkedList;

public class LinkedListTraversal {
	static Node head;
	public static void main(String[] args) {
		head = new Node(1);
		Node first = new Node(2);
		Node third = new Node(3);
		
		head.setNode(first);
		first.setNode(third);
		
		printList(head);
		
		//Add at first
		int data = 7;
		addElementAtFirst(data);
		
		//Add after given node
		data = 4;
		addElementAfterNode(first,data);
		
		//Add at end
		data = 5;
		addElementAtEnd(data);
		
		printList(head);
		
		//Delete Node when data is given
		deleteNode(5);
		
		//Delete Node when node to be deleted is given
		/*deleteNode(head);
		
		//Delete all linked list
		deleteList(head);*/
		printList(head);
		
	}

	private static void printList(Node node){
		while(node != null){
			System.out.print(node.getData()+"\t");
			node = node.getNode();
		}
		System.out.println("\n");
	}
	//Complexity O(1)
	private static void addElementAtFirst(int data){
		Node node = new Node(data);
		node.setNode(head);
		head = node;
	}
	//Complexity O(1)
	private static void addElementAfterNode(Node prevNode, int data){
		Node node = new Node(data);
		node.setNode(prevNode.getNode());
		prevNode.setNode(node);
	}
	//Complexity O(n) n=length of linked list
	private static void addElementAtEnd(int data){
		Node node = new Node(data);
		Node last = head;
		while(last.getNode() != null){
			last = last.getNode();
		}
		last.setNode(node);
	}
	
	private static void deleteNode(int key){
		Node prevNode = null;
		Node node = head;
		//If key is at the start
		if(node != null && node.getData() == key){
			head = head.getNode();
		}
		while(node != null && node.getData() != key){
			prevNode = node;
			node = node.getNode();
		}
		//If key is last element
		if(node != null && prevNode != null){
			prevNode.setNode(node.getNode());
		}
		else{
			System.out.println("key is not in list");
		}
	}
	
	private static void deleteNode(Node node) {
		node.setData(node.getNode().getData());
		node.setNode(node.getNode().getNode());		
	}
	
	private static void deleteList(Node node) {
		while(node.getNode() != null){
			node.setData(node.getNode().getData());
			node.setNode(node.getNode().getNode());	
		}
	}
}
