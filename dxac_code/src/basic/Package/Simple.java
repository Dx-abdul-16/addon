package basic.Package;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the value");
		int r = in.nextInt();
		
		float res = (float) (Math.PI * r * r);
		
		System.out.println("radius:" +res);
	}

}
