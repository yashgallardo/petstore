package Practice;

import java.util.Scanner;

public class Constructor {
	String captcha;
	public void getlogin()
	{
		System.out.println("enter captch"+captcha);
	Scanner login=new Scanner(System.in);
	captcha=login.toString();
	System.out.println("enter captcha"+captcha);
	}
	public static void main(String args[])
	{

		Constructor ob=new Constructor();
	ob.getlogin();
	}
	
}
