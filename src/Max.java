import java.util.Scanner;

public class Max {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int n2=sc.nextInt();
	int A[]=new int[n2];
	for(int i=0;i<n2;i++) {
		A[i]=sc.nextInt();
	}
	int max=A[0];
	for(int i=0;i<A.length;i++) {
		if(A[i]>max) {
			max=A[i];
		}
	}
	System.out.print(max+n2);
}
}
