class StacksUsingResizableArraysGenerics<E> {
	// array to store data
	private E[] arr;
	// default size of array
	private int size = 2;
	// variable to access index of array
	private int index = 0;
	// constructor to initialize array 
	StacksUsingResizableArraysGenerics(){
		arr = (E[])new Object[size];
	}
	private void resizeArray(int capacity){
		E[] temp = (E[])new Object[capacity];
		for(int i=0;i<index;i++){
			temp[i] = arr[i];
			// System.out.println(arr[i]);
		}
		arr = temp;
		size = capacity;
	}
	public void push(E data) {
		// Check if array size exceeds the max limit
		// index++;
		if(index == size){
			resizeArray(2 * size);
		}
		arr[index++] = data;
	}
	public E pop() { 
		// Check if stack is empty.... throw stack undeflow exception
		// if(isEmpty()){
		// 	System.out.println("Stack Underflow!");
		// 	return 0;
		// }
		E ss = (E)arr[--index];
		// if last index is quarter of total size of array then shrink the array by half
		if(index == (size/4) && index > 0){
			resizeArray(size/2);
		}
		
		// arr[index] = null; 
		// --index;
		return ss; 
	} 
	public boolean isEmpty(){
		return index == -1;
	}
}