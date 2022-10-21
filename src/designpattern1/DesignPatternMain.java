package designpattern1;

import java.util.Scanner;


 
public class DesignPatternMain {
	 static Scanner scanner = new Scanner(System.in);
	 

	public static void main(String[] args) 
	{
		System.out.println("### Design of Facade Pattern ###");
		Facade facade = new Facade();
		System.out.println("Please Login into your account");
		System.out.println("*******************************");
		facade.login();
	}
}
