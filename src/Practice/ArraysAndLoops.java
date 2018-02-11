package Practice;

public class ArraysAndLoops {
	public static void main (String args[]) {
		ArraysAndLoops ob = new ArraysAndLoops();
		ob.dowhileloop();}
	public void dowhileloop(){	
	double price[] = {12.22,33,33,44.22,232.33};
	
	int j =0;
		int total = price.length;
		System.out.println(total);
	do {
		System.out.println(price[j]);
		j= j+1;}
		while (j<total);}
	}
		
	
	
