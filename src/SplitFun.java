import java.util.*;
public class SplitFun {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String[] s=str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
		   System.out.print(s[i]+" ");
		}
}
}
