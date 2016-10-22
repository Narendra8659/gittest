package Practice;

public class ReturnValue
{
 public static void main(String[] args)
 {
     // Populate a character array with data.
     char[] arr = new char[] {'N','A','R','E'};
     												// Create a String containig the contents of arr.
     String Letter = String.copyValueOf(arr);
     System.out.println("The new String contains "+ Letter);
 }
}


