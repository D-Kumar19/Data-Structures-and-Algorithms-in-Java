package DataStrcuturesAndAlgorithms.LinkedList;

public class Node {
	private int data;
	private Node nextNode;
	private Node previousNode;

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node(int data){
		this.data = data;
	}

	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}