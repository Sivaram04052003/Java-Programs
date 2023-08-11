import java.util.Scanner;

public class MostMinOccurChar {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
   int[]c = new int[str.length()];    
   char minChar = str.charAt(0);
   char maxChar = str.charAt(0);    
   int min, max;            
   char s[] = str.toCharArray();    
   for(int i=0;i<s.length; i++) 
	  {    
       c[i] = 1;    
       for(int j=i+1;j<s.length; j++) 
		  {    
           if(s[i]==s[j]) 
			  {    
               c[i]++;    
               s[j] = '0';    
           }    
       }    
   }    
   min=max=c[0];    
   for(int i=0;i<c.length;i++) 
	  {    
       if(min>c[i]) 
		  {    
           min=c[i];    
           minChar=s[i];    
       }    
       if(max<c[i]) 
		  {    
           max = c[i];    
           maxChar = s[i];    
       }    
   }             
   System.out.println(minChar);    
   System.out.println(maxChar);
}

         
}  
