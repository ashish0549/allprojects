/*write a program for dress size
* like 26=extra small
* 28=small size
* 30=medium
* 32=large
* 34=Extra large
* 36=extra extra large..
*/
/*
package Control_statement_practise;

public class Switchcase_test {

	public static void main(String[] args) {
		int size = 30; // example dress size

        switch (size) {
            case 26:
                System.out.println("Extra Small");
                break;
            case 28:
                System.out.println("Small Size");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 32:
                System.out.println("Large");
                break;
            case 34:
                System.out.println("Extra Large");
                break;
            case 36:
                System.out.println("Extra Extra Large");
                break;
            default:
                System.out.println("Size not available");
        }                

	}

}
*/



/* 2. WAP for simple calculator
* like addition, subtraction , multiplication, division*/

package Control_statement_practise;

public class Switchcase_test {
	public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        char operator = '+'; 

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

