import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s;
      String reverse="";
      System.out.println("Enter the String");
      Scanner sc=new Scanner(System.in);
      s=sc.nextLine();
      int len=s.length();
      for(int i=len-1;i>=0;i--) {
    	  reverse=reverse+s.charAt(i);
      }
      System.out.println("the reverse string is "+reverse);
	}

}
