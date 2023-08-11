import java.io.Console;
public class DisplayName {
  public static void main(String[] args) {
	  Console c=System.console();
	  System.out.println("Enter Name");
	  String name=c.readLine();
	  System.out.println("Hi "+name);
  }
}
