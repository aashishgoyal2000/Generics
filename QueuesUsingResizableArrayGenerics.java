class QueuesUsingResizableArrayGenerics<E>{
	private int head = 0, tail = 0, size =2;
	private E[] que;
	QueuesUsingResizableArrayGenerics(){
		que = (E[])(new Object[size]);
	}
	public void enqueue(E data){
		if(tail == size && tail - head <= size && head != 0) {
			resizeArray(size);
		}
		else if (tail - head == size){
			resizeArray(size * 2);
		}
		que[tail++] = data;
	}
	public E dequeue(){
		if (isEmpty()) {
			return null;
		}
		E temp = que[head++];
		if (tail - head == (size/4) && !isEmpty()){
			resizeArray(size/2);
		}
		return temp;
	}
	public boolean isEmpty(){
		return head == tail && head == 0;
	}
	public void resizeArray(int capacity){
		E[] temp = (E[])(new Object[capacity]);
		int i = 0;
		for (i = head; i < tail; i++) {
			temp[i - head] = que[i];
		}
		tail = tail - head;
		head = 0;
		que = temp;
		size = capacity;
	}
	public static void main(String[] args) {
		QueuesUsingResizableArrayGenerics<Integer> qura = new QueuesUsingResizableArrayGenerics<Integer>();
		qura.enqueue(1);
		qura.enqueue(2);
		qura.enqueue(3);
		qura.enqueue(4);
		qura.enqueue(5);
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		qura.enqueue(4);
		qura.enqueue(5);
		System.out.println(qura.dequeue());
		qura.enqueue(4);
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
	}
}