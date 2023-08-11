import java.util.Scanner;
public class NonRepeated {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++) {
		boolean find=true;
		for(int j=0;j<str.length();j++) {
			if(i!=j && str.charAt(i)==str.charAt(j)) {
				find=false;
				break;
			}
		}
		if(find) {
		  System.out.print(str.charAt(i));
		  break;
		}
	}
}
}
