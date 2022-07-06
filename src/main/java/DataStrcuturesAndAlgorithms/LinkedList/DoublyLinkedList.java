package DataStrcuturesAndAlgorithms.LinkedList;

public class DoublyLinkedList {
	private Node head;
	private Node tail;

	public void insertAtTail(int item) {
		Node newNode = new Node(item);

		if(head == null) {
			head = tail = newNode;
			head.setPreviousNode(null);
			tail.setNextNode(null);
		}
		else {
			tail.setNextNode(newNode);
			newNode.setPreviousNode(tail);
			tail = newNode;
			tail.setNextNode(null);
		}
	}

	public void insertAtHead(int data){
		Node newNode = new Node(data);

		if(head == null) {
			head = tail = newNode;
			head.setPreviousNode(null);
			tail.setNextNode(null);
		}
		else {
			head.setPreviousNode(newNode);
			newNode.setNextNode(this.head);
			head = newNode;
			head.setPreviousNode(null);
		}
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

	public void deleteTheNode(int data) {
		Node searchForNode = searchNode(data);
		if (head == null || searchForNode == null) {
			return;
		}
		if (head == searchForNode) {
			head = searchForNode.getNextNode();
		}
		if (searchForNode.getNextNode() != null) {
			searchForNode.getNextNode().setPreviousNode(searchForNode.getPreviousNode());
		}
		if(searchForNode.getPreviousNode() != null){
			searchForNode.getPreviousNode().setNextNode(searchForNode.getNextNode());
		}
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