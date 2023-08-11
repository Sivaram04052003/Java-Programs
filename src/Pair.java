import java.util.Scanner;

public class Pair {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int A[]=new int[n];
	for(int i=0;i<n;i++) {
		A[i]=sc.nextInt();
	}
	int x=sc.nextInt();
	int h=0;
	for(int i=0;i<A.length;i++) {
		for(int j=i+1;j<A.length;j++) {
			if(A[i]+A[j]==x) {
				System.out.print(A[i]+" "+A[j]);
				h=1;
				return;
			
			}
		}
	}
	if(h==0) {
		System.out.println("Pair not");
	}
}
}
