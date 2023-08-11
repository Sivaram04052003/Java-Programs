import java.util.Scanner;

public class InverseFraction {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String[] arr=sc.next().split("/");
	int x=Integer.parseInt(arr[0]);
	int y=Integer.parseInt(arr[1]);
	System.out.printf("%.2f",(float)y/x);
}
}
