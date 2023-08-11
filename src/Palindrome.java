import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a=n;
		while(n!=0) {
			int k=n%10;
			rev=rev*10+k;
			n=n/10;
		}
		if(a==rev) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
