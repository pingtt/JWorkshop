package jworkshop;

public class SimpleQueue<A> {
	
	private Node<A> head;
	private Node<A> tail;
	
	public SimpleQueue(Node<A> node){
		head = node;
		tail = node;
	}
	
	public void addNode(Node<A> node){
		tail.addNode(node);
		tail = node;
	}

	public Node<A> removeNode(){
		Node<A> currentHead = head;
		
		if (head != null)
			head = head.nextNode();
		
		return currentHead;
	}
	
}
