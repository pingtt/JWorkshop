package jworkshop;

public class Node <A>{
	
	private A value;
	private Node<A> node;
	
	public Node(A value){
		this.value = value;
	}
	
	public A getValue(){
		return value;
	}
	
	public void addNode(Node<A> node){
		this.node = node;
	}
	
	public Node<A> nextNode(){
		return node;
	}

}
