package linkedList;

public class LinkedListTraversal {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = new Node(2);
		Node third = new Node(3);
		
		head.setNode(first);
		first.setNode(third);
		
		printList(head);
		
		//Add at first
		int data = 7;
		addElementAtFirst(head,data);
		
		//Add after given node
		data = 4;
		addElementAfterNode(first,data);
		
		//Add at end
		data = 5;
		addElementAtEnd(head,data);
		
		printList(head);
		
		//Delete Node when data is given
		deleteNode(head, 7);
		
		//Delete Node when node to be deleted is given
		deleteNode(head);
		
		//Delete all linked list
		deleteList(head);
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
	private static void addElementAtFirst(Node head, int data){
		Node node = new Node(head.getData());
		node.setNode(head.getNode());
		head.setData(data);
		head.setNode(node);
	}
	//Complexity O(1)
	private static void addElementAfterNode(Node prevNode, int data){
		Node node = new Node(data);
		Node temp = prevNode.getNode();
		prevNode.setNode(node);
		node.setNode(temp);
	}
	//Complexity O(n) n=length of linked list
	private static void addElementAtEnd(Node head, int data){
		Node node = new Node(data);
		while(head.getNode() != null){
			head = head.getNode();
		}
		head.setNode(node);
	}
	
	private static void deleteNode(Node node, int key){
		Node prevNode = null;
		while(node != null && node.getData() != key){
			prevNode = node;
			node = node.getNode();
		}
		if(node != null && prevNode != null){
			prevNode.setNode(node.getNode());
			node = null;
		}else if(prevNode == null){
			Node temp = node;
			node.setData(node.getNode().getData());
			node.setNode(node.getNode().getNode());
			temp = null;
		}else{
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
