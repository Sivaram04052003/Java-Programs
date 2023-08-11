import java.util.Scanner;

public class StringSameCount {
public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException {
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	char x[]=str1.toCharArray();
	char y[]=str1.toCharArray();
	int c=0;
	for(int i=0;i<str1.length();i++) {
		if(x[i]==y[0]&&x[i+1]==y[1]) {
			c++;
		}
	}
	System.out.print(c);
	}
}
