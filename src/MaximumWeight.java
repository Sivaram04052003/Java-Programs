import java.util.Arrays;
import java.util.List;

public class MaximumWeight {
	public static int Weight(int n,List<Integer>Edge) {
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			if(Edge.get(i)!=-1) {
				temp[Edge.get(i)]+=i;
			}
		}
		int res=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(temp[i]>max) {
				res=i;
				max=temp[i];
			}
		}
		return res;
		
	}
public static void main(String[] args) {
	int n=23;
	List<Integer>Edge=Arrays.asList(4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21);
    System.out.println(Weight(n,Edge));
}
}
