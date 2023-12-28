public class StackArrDynamic implements IntStack{
	int tos;
	int stk[];

	public StackArr2(int size){
		tos = -1;
		stk = new int[size];
	}

	public void push(int item){
		if(tos == stk.length - 1){
			System.out.println("Stack Overflow");
		}

		else{
			stk[++tos] = item;
		}
	}

	public int pop(){
		if(tos == -1){
			System.out.println("Stack underflow");
			return 0;
		}

		else{
			return stk[tos--];
		}
	}
}