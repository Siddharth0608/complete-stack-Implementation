public class StackArr implements IntStack{
	int tos;
	int stk[];

	public StackArr(int size){
		tos = -1;
		stk = new int[size];
	}

	public void push(int item){
		if(tos == stk.length - 1){
			int temp[] = new int[stk.length*2];
			for(int a = 0; a < stk.length; a++){
				temp[a] = stk[a];
			}
			stk = temp;
			stk[++tos] = item;
		}

		else{
			stk[++tos] = item;
		}
	}

	public int pop(){
		if(tos == -1){
			System.out.println("Stack Underflow");
			return 0;
		}


		else{
		return stk[tos--];
		}
	}
}