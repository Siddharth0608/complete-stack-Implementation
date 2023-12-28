public class StackLinked implements IntStack{
	Node top;
	int size;

	public StackLinked(){
		top = null;
		size = 0;
	}

	public void push(int item){
		Node node = new Node();
		node.setNext(top);
		node.setData(item);
		top = node;
		size++;
	}

	public int pop(){
		if(top == null){
			System.out.println("Stack underflow");
			return 0;
		}

		else{
			int x = top.getData();
			top = top.getNext();
			return x;
		}

	}

}