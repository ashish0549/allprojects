
/*package Control_statement_practise;

public class Test {
	public static void main(String[] args) {
		int age= 10;
		if(age>=18) 
		{
			System.out.println("Eligible for voting");
		
		}
		else
		{
			System.out.println("Not Eligible for voting");
		}
		}   
}
*/



/* write a java program using if -else stmt that checks a person's eligibility for entry an
discount offers based on the following condition
1. the person must be 18 years or older and must have an id card to be allowed entry
2.the person gets a student discount if they are under 18 or if they are a student*/
/*package Control_statement_practise;

public class Test {
	public static void main(String[] args) {
		int age= 16;
		boolean entrycard= true;
		boolean student=false; 
		if(age>=18 && (entrycard || student)) 
		{
			System.out.println("Allowed for entry but not eligible for discount");
		
		}
		if(age<=18 &&  student )
		{
			System.out.println("Allowed for entry and is eligible for student discount");
		
		}	
		else
		{
			System.out.println("Entry is not allowed and Student discount cannot be availed");
		}
		}   
}
*/




/*print weekdays if it is mon, tue, wed, thu, fri
* else print weekend*/


/*package Control_statement_practise;
public class Test {
	public static void main(String[] args) {
		String day="Sun"; 
		if(day=="Sat"||day=="Sun") 
		{
			System.out.println("Weekend");
		
		}
		else
		{
			System.out.println("Weekday");
		}
		}   
}
*/





/*check if a student is eligible for a scholarship
* 1. a student must have score above 80 or must be from reserved category
*
* output=Scholarship granted or
* not eligible for the scholarship*/
package Control_statement_practise;

public class Test {
	public static void main(String[] args) {
		int Student_score= 60;
		boolean Reserved_cat= true;
		 
		if(Student_score>=80 ) 
		{
			System.out.println("Eligible for Scholarship");
		
		}
		if(Student_score>=30 && Student_score<80 && Reserved_cat )
		{
			System.out.println("eligible for Scholarship under reserved category");
		
		}	
		else
		{
			System.out.println("Student is not Eligible for Scholarship");
		}
		}   
}

