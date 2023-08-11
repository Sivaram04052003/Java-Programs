import java.util.Scanner;

public class QuickSort {
	public static void Quick(int A[],int low,int high) {
		if(low<high) {
			int index=Sort(A,low,high);
			Quick(A,low,index-1);
			Quick(A,index+1,high);
		}
	}
private static int Sort(int[] A, int low, int high) {
		int pivot=A[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(A[j]<pivot) {
				i++;
				swap(A,i,j);
			}
		}
		swap(A,i+1,high);
		return i+1;
	}
private static void swap(int[] A, int i, int j) {
	int temp=A[i];
	A[i]=A[j];
	A[j]=temp;
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	int len=A.length;
	Quick(A,0,len-1);
	for(int num:A) {
		System.out.print(num+" ");
	}
}
}
