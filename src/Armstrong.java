import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int a=n;
        while(n!=0) {
        	int k=n%10;
        	sum=sum+k*k*k;
        	n=n/10;
        }
        if(a==sum) {
        	System.out.println("Armstrong number");
        }
        else {
        	System.out.println("Not Armstrong number");
        }
	}

}
