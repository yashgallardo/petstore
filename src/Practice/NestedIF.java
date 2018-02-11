package Practice;

public class NestedIF   {

	public void openbrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.out.println("test run in chrome");
			}
		
		else if (browsername.equals("firefox")) {
			System.out.println("test run in firefox");
			}
		else if (browsername.contains("explorer"));	{
		System.out.println("test run in iebrowser");
		}
		 
		System.out.println("please enter correct browser name");
		
}
		public static void main (String args[]) {
			NestedIF ob = new NestedIF();
			ob.openbrowser("internet explorer");
}
	}
	