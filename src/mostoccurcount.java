import java.util.Scanner;

public class mostoccurcount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
	int c[]=new int[256];
	int count=0;
	char[] ch=str1.toCharArray();
	for(int i=0;i<ch.length;i++) {
		c[ch[i]]++;
	}
	for(int i=0;i<256;i++) {
		if(c[i]==2) {
			count++;
		}
	}
	System.out.print(count);
}
}
