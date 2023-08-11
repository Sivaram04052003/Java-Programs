import java.util.*;
public class SecondMostCharacter {
 public static char SEC(String str) {
	 int c[]=new int[256];
	 int first=0,sec=0;
	 for(int i=0;i<str.length();i++) {
	 	c[str.charAt(i)]++;
	 }
	 for(int i=0;i<256;i++) {
	 	if(c[i]>c[first]) {
	 		sec=first;
	 		first=i;
	 	}
	 	else if(c[i]>c[sec] && c[i]!=c[first]) {
	 		sec=i;
	 	}
	 }

	 return (char)sec;
 }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char res=SEC(str);
if(res!='\0') {
	System.out.println(res);
}
}
}
