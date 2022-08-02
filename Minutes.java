package assignment;
import java.util.Scanner;
public class Minutes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the minutes :");
		int min =input.nextInt();
		int year=min/525600;
		int days = min/1440;
		System.out.println(min+"min is"+year+"year and"+days+"days");
}
}
