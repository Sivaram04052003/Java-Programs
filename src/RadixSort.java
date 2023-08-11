import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
	public static int maximum(int A[],int n) {
		int max=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>max) {
				max=A[i];
			}
		}
		return max;
		
	}
	public static void sort(int A[],int n,int exp) {
		int out[]=new int[n];
		int c[]=new int[10];
		Arrays.fill(c,0);
		for(int i=0;i<A.length;i++) {
			c[(A[i]/exp)%10]++;
		}
		for(int i=1;i<10;i++) {
			c[i]+=c[i-1];
		}
		for(int i=A.length-1;i>=0;i--) {
			out[c[(A[i]/exp)%10]-1]=A[i];
			c[(A[i]/exp)%10]--;
		}
		for(int i=0;i<A.length;i++) {
			A[i]=out[i];
		}
	}
	public static void Radix(int A[],int n) {
		int m=maximum(A,n);
		for(int exp=1;m/exp>0;exp*=10) {
			sort(A,n,exp);
		}
	}
	public static void display(int A[],int n) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	Radix(A,n);
	display(A,n);
}
}
