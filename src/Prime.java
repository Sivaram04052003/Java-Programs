import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0;
		
		System.out.println("Enter a  number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int res=h;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				h++;
				break;
			}
		}
      if(h==0) {
    	  System.out.println("Prime number");
      }
      else {
    	  System.out.println("Not a prime");
      }
	}

}
