import java.util.Scanner;

public class StringRevereseItSelf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split(" ");
		String rev=" ";
		for(String sr:s) {
			String reverse1=" ";
			for(int i=sr.length()-1;i>=0;i--) {
				reverse1=reverse1+sr.charAt(i);
				
			}
			rev=rev+reverse1+" ";
			
		}
		System.out.print(rev);
		}

}
