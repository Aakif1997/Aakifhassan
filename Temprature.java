package assignment;
import java.util.Scanner;
public class Temprature {
	public static void main(String[] args) {
			
			float temp;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the temperature: ");
			temp=s.nextFloat();
			temp=((temp-32)*5)/9;
			System.out.println("celsium temp is"+temp);
}
}
