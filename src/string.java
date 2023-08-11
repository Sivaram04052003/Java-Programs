import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       String rev=" ";
       int len=str.length();
       for(int i=len-1;i>=0;i--) {
    	   rev=rev+str.charAt(i);
       }
       System.out.print(rev);
	}

}
