import java.util.Scanner;

public class StringTovalue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char x[]=str.toCharArray();
	int sum=0;
	for(int i=0;i<x.length;i++) {
		if(x[i]=='a') {
			sum=sum*2+1;
		}
		if(x[i]=='b') {
			sum=sum*2;
		}
	}
	System.out.print(sum);
}
}
