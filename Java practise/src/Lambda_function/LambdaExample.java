package Lambda_function;
interface Even
{
 boolean isEven(int num);	
}
public class LambdaExample {
	public static void main (String[] args) 
	{
		Even check=(num)->num%2==0;
		System.out.println(check.isEven(5));
		
	}
	
}

