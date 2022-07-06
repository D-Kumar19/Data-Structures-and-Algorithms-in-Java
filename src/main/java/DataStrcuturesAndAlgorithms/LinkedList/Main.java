package DataStrcuturesAndAlgorithms.LinkedList;

public class Main {
	public static void main(String[] args) {
		// Singly Linked List:
		LinkedList singleHeadedLinkedList= new LinkedList();
		singleHeadedLinkedList.insertAtHead(5);
		singleHeadedLinkedList.insertAtHead(10);
		singleHeadedLinkedList.insertAtHead(15);
		singleHeadedLinkedList.insertAtHead(19);
		singleHeadedLinkedList.insertAtHead(2);
		singleHeadedLinkedList.insertAtHead(24);
		singleHeadedLinkedList.insertAtHead(78);
		System.out.println("The Linked List looks like this: " + singleHeadedLinkedList);
		System.out.println("The size of the Linked List is: " + singleHeadedLinkedList.findLength());

		singleHeadedLinkedList.deleteTheHeadNode();
		System.out.println("The Linked List looks like this after deleting the head: " + singleHeadedLinkedList);

		System.out.println("Is Node 15 there? " + singleHeadedLinkedList.searchNode(15));
		System.out.println("Is Node 75 there? " + singleHeadedLinkedList.searchNode(75));

		// Doubly Linked List:
		System.out.println();
		DoublyLinkedList doubleHeadedLinkedList= new DoublyLinkedList();
		doubleHeadedLinkedList.insertAtTail(5);
		doubleHeadedLinkedList.insertAtTail(10);
		doubleHeadedLinkedList.insertAtHead(20);
		doubleHeadedLinkedList.insertAtTail(15);
		doubleHeadedLinkedList.insertAtTail(78);
		doubleHeadedLinkedList.insertAtTail(0);
		doubleHeadedLinkedList.insertAtHead(75);
		doubleHeadedLinkedList.insertAtTail(8);
		System.out.println("The Doubly Linked List looks like this: " + doubleHeadedLinkedList);

		doubleHeadedLinkedList.deleteTheNode(20);
		System.out.println("The Linked List looks like this after deleting the head: " + doubleHeadedLinkedList);
	}
}