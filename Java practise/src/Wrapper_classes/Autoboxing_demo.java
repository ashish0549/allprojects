package Wrapper_classes;

public class Autoboxing_demo {
	public static void main(String[] args) {
		//Auto boxing (convert primitive into wrapper class
		int num = 10;
	    System.out.println("Primitive type of data = "+ num);//memory allocation for 4 bytes
	    Integer num1 = num; // convert primitive int to Object Integer
	    System.out.println("Wrap data = "+ num1);
	    
	    
	    
	    //Unboxing(Convert wrapper to primitive)
	    Integer a=20;
	    System.out.println("for object = "+a);
	    int b=a;//Unboxing(Object to primitive int)
	    System.out.println("For primitive type of data int = "+b);
	    
	    
	    String str= "12345";
	    int ab= Integer.parseInt(str);
	    System.out.println(ab);
	    // If str is "Hello" i.e with characters or special characters 
	    //it wont be able to convert to string and throws an Exception(Number format exceotion
	    
	    String n=Integer.toString(num);
	    System.out.println("String type of data n = "+n);
	    
	    
	    
	    String input = "Nasir123456"; 
        int digitCount = 0;
        int charCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                charCount++;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of digits: " + digitCount);
	}
}
	