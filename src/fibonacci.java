import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i<=1) {
				n3=i;
			}
			else {
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
			System.out.println(" "+n3);
		}

	}

}
