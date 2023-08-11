import java.util.Scanner;

public class MaximumAndMinimum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<A.length;i++) {
		A[i]=sc.nextInt();
	}
	int max=A[0];
	int min=A[0];
	for(int i=0;i<A.length;i++) {
		if(A[i]>max) {
			max=A[i];
		}
		}
	System.out.println(max);
	for(int i=0;i<A.length;i++) {
		if(min>A[i]) {
		   min=A[i];
		}
		}
	System.out.println(min);
}
}
