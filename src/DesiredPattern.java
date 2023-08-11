import java.util.Scanner;

public class DesiredPattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n/2;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		for(int j=1;j<=n-i+1;j++) {
			System.out.print(n-i+1);
		}
		System.out.println();
	}
}
}
