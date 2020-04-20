class QueuesUsingArraysGenerics<E>{

	E[] arr;

	int head=0,tail=0;

	QueuesUsingArraysGenerics(){
		arr = (E[])new Object[1000];
	}


	void enqueue(E data){
		arr[tail++] = data;
	}

	E dequeue(){
		E temp = arr[head++];
		return temp;
	}

	boolean isEmpty(){
		return head == tail && head == 0;
	}

}