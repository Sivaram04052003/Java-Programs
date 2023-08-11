import java.util.Scanner;
public class Automorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int s=n*n;
		int temp=n;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		int m=(int)(s%(Math.pow(10, count)));
        if(n==m) {
        	System.out.println("Automarphic Number");
        }
        else {
        	System.out.println("Not Automarphic Number");

        }
	}

}
