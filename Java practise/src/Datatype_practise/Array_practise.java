
// for a Single Array
/*
package Datatype_practise;

public class Array_practise {
	public static void main(String[] args) {
        float[] per = {86.7f, 98.7f, 79}; // Array of percentages
        float min = per[0]; // Initialize min with the first element of the array

        for(int i = 0; i < per.length; i++) {
            if(per[i] < min) {
                min = per[i]; // Find the highest percentage
            }
        }

        System.out.println("minimum percentage = " + min); // Print the minimum percentage
    }
}
*/

//2D array
// Find out second highest float num from 10 number using arrray
/*
package Datatype_practise;

public class Array_practise {
	public static void main(String[] args) {
        int [][] num= new int[4][3]; // Array of percentages
        

        for(int i= 0; i <num.length; i++) 
        {
            for(int j=0; j<num[i].length; j++) 
            {
            	System.out.print(num[i][j]+"  ");
            	num[i][j]++;
            }
        }

        System.out.println(num);
    }
}
*/



//3D Array

package Datatype_practise;

public class Array_practise {
	public static void main(String[] args) {
        ///ref r c
		int[] [] [] arr = {  { {10,20},{20,30} },
				{ {40,50,60},{30,60,70},{20,50,80,90}  }  };
				
        

        for(int i= 0; i < arr.length; i++) 
        {
            for(int j=0; j< arr[i].length; j++) 
            {
            	for(int k=0; k< arr[i][j].length; k++) 
                {
            		System.out.print(arr[i][j][k]+"   ");
            		
                }
            	System.out.println();
            }
            System.out.println();
        }
	}
}
