package Stack;

public class Stack {
	int capacity;
	static Node top = null;
	int length = 0;
	public Stack(int capacity) {
		super();
		this.capacity = capacity;
	}
	public boolean isFull(){
		return (length == (capacity-1));
	}
	public boolean isEmpty(){
		return length == 0;
	}
	public int pop(){
		if(isEmpty()){
			return -1;
		}
		int data = top.getData();
		top = top.getNode();
		length--;
		return data;
	}
	public void push(int data){	
		if(isFull()){
			return;
		}
		Node node = new Node(data);
		node.setNode(top);
		top = node;
		length++;
	}
}
