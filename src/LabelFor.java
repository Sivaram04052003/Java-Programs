
public class LabelFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         aa:for(int i=1;i<=5;i++) {
        	 bb:for(int j=1;j<=5;j++) {
        		 if(i==2&&j==2) {
        			 System.out.println(i+" "+j);
        			 break bb;
        		 }
        	 }
        	 System.out.println("I am out of inner loop");
         }
	}

}
