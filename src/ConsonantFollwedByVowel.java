import java.util.Scanner;
public class ConsonantFollwedByVowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char x[]=str.toCharArray();
	for(int i=0;i<x.length;i++) {
		if(x[i]>='a'&&x[i]<='z' || x[i]>='A'&&x[i]<='Z') {
			if((x[i]!='a'&&x[i]!='e'&&x[i]!='i'&&x[i]!='o'&&x[i]!='u'&&x[i]!='A'&&x[i]!='E'&&x[i]!='I'&&x[i]!='O'&&x[i]!='U')&&(x[i+1]=='a'||x[i+1]=='e'||x[i+1]=='i'||x[i+1]=='o'||x[i+1]=='u'||x[i+1]=='A'||x[i+1]=='E'||x[i+1]=='I'||x[i+1]=='O'||x[i+1]=='U')) {
				System.out.print(" "+x[i]+x[i+1]);
			}
		}
	}
}
}
