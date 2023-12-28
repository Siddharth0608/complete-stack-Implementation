import java.util.*;
public class Main{
	public static void main(String[] args) {
		IntStack obj1 = new StackArr(3);
		IntStack obj2 = new StackArr2(10);
		IntStack obj3 = new StackLinked();
		Scanner inp = new Scanner(System.in);
		int i = 0;
		do{
			System.out.println("Press 1 to implement Stack through Array, Press 2 to  implement Stack through Complete Array or Press 3 to implement Stack through Linked List");
			int a = inp.nextInt();

			switch(a){
				case 1:
					
					int b;

					do{
						System.out.println("Press 1 to push items on the stack or press 2 to pop items from the stack");
						int c = inp.nextInt();
						switch(c){
							case 1:
								System.out.println("Enter data you wish to enter");
								int data = inp.nextInt();
								obj1.push(data);
								break;

							case 2:
								System.out.println(obj1.pop());
								break;			
						}

					System.out.println("Press 1 to continue or press 2 to exit");
					b = inp.nextInt();
					}
					while(b == 1);


				case 2:
					
					int d;

					do{
						System.out.println("Press 1 to push items on the stack or press 2 to pop items from the stack");
						int e = inp.nextInt();
						switch(e){
							case 1:
								System.out.println("Enter data you wish to enter");
								int data1 = inp.nextInt();
								obj2.push(data1);
								break;

							case 2:
								System.out.println(obj2.pop());
								break;	
						}
					System.out.println("Press 1 to continue or press 2 to exit");	
					d = inp.nextInt();
					}
					while(d == 1);

				case 3:
					int f;

					do{
						System.out.println("Press 1 to push items on the stack or press 2 to pop items from the stack");
						int g = inp.nextInt();
						switch(g){
							case 1:
								System.out.println("Enter data you wish to enter");
								int data3 = inp.nextInt();
								obj3.push(data3);
								break;

							case 2:
								System.out.println(obj3.pop());
								break;
					}
				System.out.println("Press 1 to continue or press 2 to exit");	
				f = inp.nextInt();
				}

				while(f == 1);

		System.out.println("Press 1 to continue or press any key to exit");	
		i = inp.nextInt();
		}
	}
	while(i == 1);
}
}