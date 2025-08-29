/*write a program to check temperature and display message like
* 40c --> "Very hot
* 30-40c-->HOt
* 20-29c-->warm
* 10-19c-->Cool
* <10c-->very cool*/

/*package Control_statement_practise;

public class testifelseif {
	 public static void main(String[] args) {
	        float temp = 35.33f;

	        if (temp >= 40) {
	            System.out.println("Very hot");
	        } else if (temp >= 30 && temp <= 39) {
	            System.out.println("Hot");
	        } else if (temp >= 20 && temp <= 29) {
	            System.out.println("Warm");
	        } else if (temp >= 10 && temp <= 19) {
	            System.out.println("Cool");
	        } else {
	            System.out.println("Very cool");
	        }
	    }
	}
*/



/*write a program to calculate bill category based on units used
* units<100-->"Low usage"
* 100-299-->"Medium usage"
* 300-499-->"High usage"
* 500+-->"Very high usage"*/
package Control_statement_practise;
public class testifelseif {

public static void main(String[] args) {
        float units = 320.5f; // example units used

        if (units < 100.0f) {
            System.out.println("Low usage");
        } else if (units >= 100.0f && units <= 299.9f) {
            System.out.println("Medium usage");
        } else if (units >= 300.0f && units <= 499.9f) {
            System.out.println("High usage");
        } else {
            System.out.println("Very high usage");
        }
    }
}

