package core.concepts;

import java.util.Scanner;

public class Inputandoutput {

	public static void main(String[] args) {
		
		System.out.println("DXAC_Code :.........:");
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Get the interger input :");
		int a = in.nextInt();
		
		System.out.println("Get the byte input :");
		byte b = in.nextByte();
		
		System.out.println("Get the short input :");
		short c = in.nextShort();
		
		System.out.println("Get the long input :");
		long d = in.nextLong();
		
		System.out.println("Get the float input :");
		float e = in.nextFloat();
		
		System.out.println("Get the double input :");
		double f = in.nextDouble();
		 
		System.out.println("Get the boolean input :");
		boolean g = in.nextBoolean();
		
		System.out.println("Get the char input :");
		char h = in.next().charAt(0);
		
		System.out.println("Get the string input :");
		String name = in.nextLine();
		
		
		System.out.println();
		
		
	}

}
