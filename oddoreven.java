import java.util.Scanner;
package oddoreven;

public class oddoreven {
  public static void main(String[] args) {
	 
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter the number");
	int n=scan.nextnt();
	if (n%2==0)
		System.out.println(n+"is a even number");
	else
	    System.out.println(n+" is a odd number");
}
}
