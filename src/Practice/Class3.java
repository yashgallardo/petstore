package Practice;


	import java.util.Scanner;  
	public class Class3 {
	
	 public static void main(String args[]){  
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Rollno");
	   int Rollno = sc.nextInt();
	   System.out.println("Enter Name");
	   String Name = sc.next();
	   System.out.println("Enter Fee");
	   double Fee = sc.nextDouble();
	   System.out.println("Rollno"+"\t"+Rollno+"\t"+"Name"+"\t"+Name+"\t"+"Fee"+"\t"+Fee);
	   sc.close();
	 } 
	}   


