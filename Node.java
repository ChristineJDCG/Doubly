/*
 *Names: GONZALES, Christine Joy D.
 *       TAPEC, Deanne Ruth L.
 *       TAYABA, Andrea Gale M.
 *CLASSCODE & Schedule: 9391 9:30-11:00 TF
 *Start Date: August 23, 2019
 *Instructor: Roderick Makil
 *
 *Problem:
 *      Write a program that
 *
 *Algorithm:
 **/

public class Node<T> {

	T data;
	Node<T> nextNode;
	Node<T> prevNode;

	public Node(T data){
		this(data,null,null);
	}
	public Node(T data,Node<T> nextNode, Node<T>prevNode) {

		this.data = data;
		this.nextNode=nextNode;
		this.prevNode=prevNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node<T> getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node<T> prevNode) {
		this.prevNode = prevNode;
	}


	@Override
	public String toString() {
		return data.toString();
	}
}