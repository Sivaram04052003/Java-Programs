import java.util.Scanner;

public class LargestSumCycle {
	public static int Cycle(int edge[]) {
		int max=-1;
		boolean[] visited=new boolean[edge.length];
		boolean[] currentPath=new boolean[edge.length];
		for(int i=0;i<edge.length;i++) {
			if(!visited[i]) {
				int current = i;
				int len=0;
				while(current!=-1&&!visited[current]) {
					visited[current]=true;
					currentPath[current]=true;
					current=edge[current];
					len++;
				}
				if(current!=-1&&currentPath[current]) {
					max=Math.max(max, len);
				}
				while(current!=-1&&currentPath[current]) {
					currentPath[current]=false;
					current=edge[current];
				}
			}
		}
		return max;
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int edge[]=new int[n];
	for(int i=0;i<n;i++) {
		edge[i]=sc.nextInt();
	}
	int max=Cycle(edge);
	System.out.println(max);
}
}
