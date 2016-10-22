package Practice;

public class Palindr {

	public static void main(String[] args) {
		
		  String variable = "Mom"; //give the string name

		    StringBuffer reverse = new StringBuffer(variable).reverse(); 

		    String strRev = reverse.toString(); 

		    if(variable.equalsIgnoreCase(strRev)){
		    	//Check the condition
		    	System.out.println("Palindrome");
		    }
		    else
		    {
		    	System.out.println("Not Palindrome");
		    }

	}

}
