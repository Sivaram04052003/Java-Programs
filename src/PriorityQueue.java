class queue{
	int max;
	int A[];
	int item;
	queue(int max){
		this.max=max;
		A=new int[max];
		item=0;
	}
	public void insert(int data) {
		int i=0;
		if(!isFull()) {
			if(item==0) {
				A[item++]=data;
			}
			else {
				for(i=item-1;i>=0;i--) {
					if(data>A[i]) {
						A[i+1]=A[i];
						
					}
					else {
						break;
					}
				}
				A[item]=data;
				item++;
			}
		}
	}
	public int remove() {
		return A[item--];
	}
	public int peek() {
		return A[item-1];
	}
	public boolean isFull() {
		return item==max;
	}
	public boolean isEmpty() {
		return item==0;
	}
	
}

public class PriorityQueue {
public static void main(String[] args) {
	queue q=new queue(10);
	q.insert(10);
	q.insert(8);
	q.insert(6);
	q.insert(4);
	q.insert(2);
	System.out.println("Peek is "+q.peek());
	q.remove();
	while(!q.isEmpty()) {
		int d=q.remove();
		System.out.println(d);
	}
	
}
}
