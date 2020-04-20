class QueueUsingLinkedListGenerics<E>{

	// linked list approach to store data
	private class LinkedList<E>{
		E data;
		LinkedList next;
	}

	// Linked List object
	LinkedList first,last;

	// insert at the end of linked list
	void enqueue(E data){
		LinkedList oldLast = last;
		last = new LinkedList();
		last.data = data;
		last.next = null;
		if(isEmpty()){
			first = last;
		} else{
			oldLast.next = last;
		}
	}

	// delete from beginning of the linked list
	E dequeue(){
		// if(first == null){
		// 	return 0;
		// }
		E temp = (E)first.data;
		first = first.next;
		if(isEmpty()){
			last = null;
		}
		return (E)temp;
	}
	
	boolean isEmpty(){
		return first == null;
	}
}