class StacksUsingArraysGenerics<E> {
	// array to store data
	private E[] arr;
	// variable to access index of array
	private int index = -1;
	// constructor to initialize array 
	StacksUsingArraysGenerics(){
		// Assumiing
		arr = (E[])(new Object[1000]);
	}
	public void push(E data) throws Exception {
		// Check if array size exceeds the max limit
		if(index >= 1000){
			throw new Exception("Stack Overflow!");
		}
		arr[++index] = data;
	}
	public E pop() throws Exception { 
		// Check if stack is empty.... throw stack undeflow exception
		if(isEmpty()) { 
			throw new Exception("Stack Underflow!");
		} 
		E ss = arr[ index--]; 
		return ss; 
	} 
	public boolean isEmpty(){
		return index == -1;
	}
	// Defect.  Stack overflows when N exceeds capacit
}