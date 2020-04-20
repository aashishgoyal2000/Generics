class GenericsImplementation{
	public static void main(String[] args) throws Exception {

		System.out.println("Queues Using Arrays With Generics");
		QueuesUsingArraysGenerics<Integer> quag = new QueuesUsingArraysGenerics<Integer>();
		quag.enqueue(1);
		quag.enqueue(2);
		quag.enqueue(3);
		quag.enqueue(4);
		quag.enqueue(5);

		System.out.println();
		System.out.println(quag.dequeue());
		System.out.println(quag.dequeue());
		System.out.println(quag.dequeue());
		System.out.println(quag.dequeue());
		System.out.println(quag.dequeue());
		
		System.out.println();
		System.out.println("Queues Using Linked List With Generics");
		QueueUsingLinkedListGenerics<Integer> qullg = new QueueUsingLinkedListGenerics<Integer>();
		qullg.enqueue(1);
		qullg.enqueue(2);
		qullg.enqueue(3);
		qullg.enqueue(4);
		qullg.enqueue(5);

		System.out.println(qullg.dequeue());
		System.out.println(qullg.dequeue());
		System.out.println(qullg.dequeue());
		System.out.println(qullg.dequeue());
		System.out.println(qullg.dequeue());

		System.out.println();
		System.out.println("Stacks Using Arrays Generics");
		StacksUsingArraysGenerics<Integer> suag = new StacksUsingArraysGenerics<Integer>();
		suag.push(1);
		suag.push(2);
		suag.push(3);
		suag.push(4);
		suag.push(5);

		System.out.println(suag.pop());
		System.out.println(suag.pop());
		System.out.println(suag.pop());
		System.out.println(suag.pop());
		System.out.println(suag.pop());

		System.out.println();
		System.out.println("Stacks Using Linked List Generics");
		StacksUsingLinkedListGenerics<Integer> sullg = new StacksUsingLinkedListGenerics<Integer>();
		sullg.push(1);
		sullg.push(2);
		sullg.push(3);
		sullg.push(4);
		sullg.push(5);

		System.out.println(sullg.pop());
		System.out.println(sullg.pop());
		System.out.println(sullg.pop());
		System.out.println(sullg.pop());
		System.out.println(sullg.pop());

		System.out.println();
		System.out.println("Stacks Using Resizable Arrays With Generics");
		StacksUsingResizableArraysGenerics<Integer> surag = new StacksUsingResizableArraysGenerics();
		surag.push(1);
		surag.push(2);
		surag.push(3);
		surag.push(4);
		surag.push(5);

		System.out.println(surag.pop());
		System.out.println(surag.pop());
		System.out.println(surag.pop());
		System.out.println(surag.pop());
		System.out.println(surag.pop());		
	}
}