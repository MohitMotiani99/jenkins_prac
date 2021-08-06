//package aws2;

import java.util.Scanner;

public class finalPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Price of the Articele");
		double s = sc.nextDouble();
		System.out.println("Choose Option");
		System.out.println("1. Discount using %");
		System.out.println("2. Discount using value");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter Discount %");
			double per = sc.nextDouble();
			double fp = s*(1-per/100);
			System.out.println("Final Price is: "+fp);
			break;
		case 2:
			System.out.println("Enter Discount Value");
			double val = sc.nextDouble();
			fp = s-val;
			System.out.println("Final Price is: "+fp);
			break;
		default:
			break;
		}
		sc.close();
	}
}
