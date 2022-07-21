import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		int a[]=new int[10];
		int i,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
           n=s.nextInt();
           for(i=0;i<n;i++)
           {
        	   a[i]=s.nextInt();
           }
           System.out.println("The data extend is ");
           for (i=0;i<n;i++)
        	   System.err.println(a[i]);
	}
}
