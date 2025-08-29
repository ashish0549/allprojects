/*package Datatype_practise;

public class String_practise {

	public static void main(String[] args) {
		String st = "Hello"; 

        System.out.println(st.charAt(2));             
        System.out.println(st.codePointAt(1));       
        System.out.println(st.codePointBefore(1));    
        System.out.println(st.codePointCount(0, 3));  
        System.out.println(st.equals("hello"));       
        System.out.println(st.equalsIgnoreCase("hello"));
        System.out.println(st.isBlank());             
        System.out.println(st.isEmpty());             
        System.out.println(st.lastIndexOf("o"));      
        System.out.println(st.contains("lo"));        
    }
}
*/


package Datatype_practise;

public class String_practise {

	public static void main(String[] args) {
		String str = "Hello";
		 // Convert String to StringBuffer or StringBuilder
        // immutable String to mutable String
        StringBuffer sb = new StringBuffer(str);
        sb.append(" Dear");
        System.out.println(sb);
        sb.append(" Students");
        System.out.println(sb);

        // Convert StringBuffer/StringBuilder to String
        // mutable to immutable
        StringBuffer sbb = new StringBuffer("Pune");
        String str1 = new String(sbb);

        
    }
}