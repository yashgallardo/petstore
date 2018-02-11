package Practice;

public class ArraysLoops {
	public static void main (String args[]) {
		int a[]={33,3,4,5};
	  for(int i=0;i<a.length;i++)
			 System.out.println(a[i]);
	  
	  int b[]= new int[10];
	  b[0]=10000;
	  b[1]=10000;
	  b[2]=10000;
	  b[3]=10000;
	  b[4]=10000;
	  b[5]=10000;
	  b[6]=10000;
	  for(int i=0;i<b.length;i++)
			 System.out.println(b[i]);
	  
	  int arr[][]=new int[3][3];
	  arr[0][0]=1;  
	  arr[0][1]=2;  
	  arr[0][2]=3;  
	  arr[1][0]=4;  
	  arr[1][1]=5;  
	  arr[1][2]=6;  
	  arr[2][0]=7;  
	  arr[2][1]=8;  
	  arr[2][2]=9;  
	  for(int i=0;i<3;i++) {
		  for(int j=0;j<3;j++) {
			 System.out.println(arr[i][j]+"");
	}
	 System.out.println();  
	  }
	  String Number[]= new String[6];
			Number[0]="10000";
			Number[1]="20000";
			Number[2]="30000";
			Number[3]="40000";
			Number[4]="50000";
			Number[5]="60000";
		int total = Number.length;
		System.out.println("Total values in array:"+ total);
		int i=0;
		while (i<6) {
			System.out.println("Array values:"+ Number[i]);
			i=i+1;
		}}
}