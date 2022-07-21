package arraymethod;
import java.util.Scanner;
public class array {
  public static void main(String[] args) {
    int a[]=new int[3];
	System.out.println("Enter the value");
	Scanner s=new Scanner(System.in);
	for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
	for (int i=0;i<a.length;i++)
		System.out.println(a[i]+" ");
	
}
}