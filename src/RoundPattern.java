import java.util.Scanner;

public class RoundPattern {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int len=2*n-1;
	 for(int i=0;i<len;i++) {
		 for(int j=0;j<len;j++) {
			 int min=i<j ? i:j;
			 min=min<len-i ? min:len-i-1;
			 min=min<len-j-1 ? min:len-j-1;
			 
			 System.out.print(n-min+" ");
		 }
		 System.out.println("\n");
	 }
 }
}
