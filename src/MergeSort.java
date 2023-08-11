import java.util.Scanner;

public class MergeSort {
	public static void Merge(int A[],int left,int right) {
		if(left<right) {
			int mid=left+(right-left)/2;
			Merge(A,left,mid);
			Merge(A,mid+1,right);
			Sort(A,left,mid,right);
		}
	}
private static void Sort(int[] A, int left, int mid, int right) {
	int n1=mid-left+1;
	int n2=right-mid;
	int leftArr[]=new int[n1];
	int rightArr[]=new int[n2];
	for(int i=0;i<n1;i++) {
		leftArr[i]=A[left+i];
	}
	for(int j=0;j<n2;j++) {
		rightArr[j]=A[mid+1+j];
	}
	int i=0,j=0;
			int k=left;
	while(i<n1&&j<n2) {
		if(leftArr[i]<=rightArr[j]) {
			A[k]=leftArr[i];
			i++;
		}
		else {
			A[k]=rightArr[j];
			j++;
		}
		k++;
	}
	while(i<n1) {
		A[k]=leftArr[i];
		i++;
		k++;
	}
	while(j<n2) {
		A[k]=rightArr[j];
		j++;
		k++;
	}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	Merge(A,0,n-1);
	for(int num:A) {
		System.out.print(num+" ");
	}
}
}
