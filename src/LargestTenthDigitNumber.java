import java.util.Scanner;

public class LargestTenthDigitNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int k=(x%100);
	int h=(y%100);
	int m=(z%100);
	int large=0;
	if(k>=h&&k>=m) {
		large=x;
	}
	else if(h>=k&&h>=m) {
		large=y;
	}
	else {
		large=z;
	}
	System.out.println(large);
}
}
