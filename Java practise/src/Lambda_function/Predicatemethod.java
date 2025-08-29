package Lambda_function;
import java .util.function.Predicate;
public class Predicatemethod {

	public static void main(String[] args) {
	Predicate<Integer> isEven = num-> num%2==0;
	System.out.println(isEven.test(7));

	}

}

//With Predicate we don't need for Interface 