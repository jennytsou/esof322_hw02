package hw02;

public class GraphDB<E> {
		
		// ----------- nested Node class -----------
		private static class Node<E> {
			
		// fields
		private E element;		// reference to the element stored at this node
		private Node<E> next;	// reference to the subsequent node in the list
				
		// constructor
		public Node(E e, Node<E> n) {
			this.element = e;
			this.next = n;
		}
				
		// methods
		public E getElement() {
			return this.element;
		}
		public Node<E> getNext() { return this.next; }
	
		public void setNext(Node<E> n) { this.next = n; }
				
	} // ----------- end of nested Node class 
		// fields 
		private Node<E> head = null;		// head node of the list (or null if empty)
		private Node<E> tail = null;		// last node of the list (or null if empty)
		private int size = 0;				// number of nodes in the list
		
		// constructor
		GraphDB() {}				// constructs an initially empty list
	
}
