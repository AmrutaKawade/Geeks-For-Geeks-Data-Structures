package linkedList;

public class GetNthNode {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		
		head.setNode(first);
		first.setNode(second);
		second.setNode(third);
		
		Node node = getNthNode(head, 3);
		if(node != null){
			System.out.println(node.getData());
		}else{
			System.out.println("node is beyond length of list");
		}
	}
	private static Node getNthNode(Node node,int n){
		int count = 0;
		while(node != null && count != n){
			node = node.getNode();
			count++;
		}
		return node;
	}
}
