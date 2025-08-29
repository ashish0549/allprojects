// check if a number is even or odd by taking user input		
/*
package Control_statement_practise;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number you want to check");
		
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even number");
			
		}
		else
			System.out.println("Odd number");
	
	}

}
*/

//Create Registration form for user using scanner class

package Control_statement_practise;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter user name:");
	String name = sc.nextLine();
    System.out.println("Enter mobile number:");
	long number = sc.nextLong();
	sc.nextLine();
	System.out.println("Enter email.id:");
	String email = sc.nextLine();
	System.out.println("Enter your date of birth:");
	String dob = sc.nextLine();
	
	
	}
}
	
	