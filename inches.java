package assignment;

import java.util.Scanner;

public class inches {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number in inches:");
		double inches = s.nextDouble();
		double meter=inches*0.0254;
		System.out.println("the number in meter"+meter);
	}
}