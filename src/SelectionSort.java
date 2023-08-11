import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		int index=i;
		for(int j=i+1;j<n;j++) {
			if(A[j]<A[index]) {
				index=j;
			}
		}
		int temp=A[index];
		A[index]=A[i];
		A[i]=temp;
	}
	for(int i=0;i<A.length;i++) {
		System.out.print(A[i]);
	}
}
}
