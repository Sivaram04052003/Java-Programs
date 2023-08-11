import java.util.Scanner;

public class StringCount {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char []s=str.toCharArray();
	int c=0;
	for(char ch:s) {
		c++;
	}
	System.out.println(c);
}
}
