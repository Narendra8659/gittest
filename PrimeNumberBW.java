package Practice;

import java.util.Scanner;

public class PrimeNumberBW {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
       System.out.print("Enter the first number number : "); //200
       int start = s.nextInt();
       System.out.print("Enter the second number number : "); //300
       int end = s.nextInt();
       System.out.println("List of prime numbers between " + start + " and " + end);
       for (int i = start; i <= end; i++) { 
           if (isPrim(i)) {
               System.out.println(i);
           }
       }
   }

   public static boolean isPrim(int n) { 
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i < Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
}

