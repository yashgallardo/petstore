package Practice;

import java.util.Scanner;

public class ScannerInput {
	boolean present;
	public void getbooleanvalue() {
	System.out.println("plz enter boolean value in console");
	Scanner ob = new Scanner(System.in);
	present = ob.nextBoolean();
	System.out.println("Boolean values"+present);
	}
	public static void main (String args[])
	{	ScannerInput ob = new ScannerInput();
	ob.getbooleanvalue();
	}
}
