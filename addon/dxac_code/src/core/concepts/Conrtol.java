package core.concepts;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Conrtol {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("ENTER THE MARITAL STATUS : ( married/ unmarried); " );
	String ms = in.nextLine().toLowerCase();
	
	if(ms.equals("married")) {
		System.out.println("YOU ARE ELIGIBLE TO THE INSURENCE...  ");
		
		}
	else if (ms.equals("unmarried")) {
		System.out.println("ENTER THE DETAILS...  ");
		System.out.println("ENTER THE GENDER (MALE / FEMALE) :...  ");
			String gender = in.nextLine().toLowerCase();
			 
	
			if ( (gender.equals("male")) || (gender.equals("female"))) {
				System.out.println("ENter you age :  ");
				int age = in.nextInt();
			}

	}

	}
}