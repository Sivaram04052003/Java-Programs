import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int fact=1;
       System.out.println("Enter The Number");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=2;i<=n;i++) {
    	   fact=fact*i;
       }
       System.out.println(fact);
	}

}
