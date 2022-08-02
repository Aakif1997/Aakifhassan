package assignment;

import java.util.Scanner;

public class Minute {

	public static void main(String[] args) {
		double minutesinyear=60*24*365;
		Scanner s=new Scanner(System.in);
		System.out.print("Input the number of minutes:");
		double min=s.nextDouble();
		long years=(long)(min/minutesinyear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+"minutes is approximately"+years+"years and"+days+"days");

	}
}