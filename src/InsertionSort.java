import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	for(int i=0;i<A.length;i++) {
		int temp=A[i];
		int j=i-1;
		while(j>=0&&temp<=A[j]) {
			A[j+1]=A[j];
			j=j-1;
		}
		A[j+1]=temp;
	}
	for(int i=0;i<A.length;i++) {
		System.out.print(A[i]);
	}
}
}
