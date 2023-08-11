
public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] or= {"The sentence in String","nice try","better luck next time"};
       String[] reversed=reverseMethod(or);
       for(String str:reversed) {
    	   System.out.print(str+" ");
       }
	}

	public static String[] reverseMethod(String[] or) {
		String[] sr=new String[or.length];
		for(int i=0;i<or.length;i++) {
			sr[i]=reverseMethod1(or[i]);
		}
		
		return sr;
	}

   public static String reverseMethod1(String string) {
		String[] rev=string.split(" ");
		StringBuilder br=new StringBuilder();
		for(int i=rev.length-1;i>=0;i--) {
			br.append(rev[i]).append(" ");
		}
		return br.toString().trim();
	}

}
