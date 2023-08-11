import java. util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter the array element");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++) {
        	array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	System.out.println(array[i]);
        }
	}

}
