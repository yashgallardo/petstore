package Practice;

import javax.swing.JOptionPane;

public class IfElseCondition {

	/*String expresscourse = "Selenium";
public void testequal() {
	String actualcourse = JOptionPane.showInputDialog("Plz enter course name");
	if (expresscourse.equals(actualcourse)) {
	System.out.println("course name is correct"+"\t"+actualcourse);
	}
	else {
		System.out.println("Course name is incorrect");
	}
		
	}*/
String expresscourse1 = "QTP";
public void testEqualTo() {
	String actualcourse = JOptionPane.showInputDialog("Plz enter course name");
	if (expresscourse1 == actualcourse){
System.out.println("course name is correct"+"\t"+actualcourse);
}
	else 
{
	System.out.println("Course name is incorrect");
	}
}
	public static void main (String args[]) {
		IfElseCondition ob = new IfElseCondition();
		//ob.testequal();
		ob.testEqualTo();
}
}
