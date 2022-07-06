package DataStrcuturesAndAlgorithms.LinkedList;

public class LinkedList {
	private Node head;

	public void insertAtHead(int data){
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int findLength(){
		Node current = this.head;
		int size = 0;
		while(current != null){
			size++;
			current = current.getNextNode();
		}
		return size;
	}

	public void deleteTheHeadNode(){
		Node current = this.head;
		this.head = current.getNextNode();
	}

	public Node searchNode(int data){
		Node current = this.head;
		while(current != null){
			if(current.getData() == data){
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("{ ");
		Node current = this.head;

		while(current != null){
			result.append(current).append(", ");
			current = current.getNextNode();
		}
		result.append("}");
		return result.toString();
	}
}