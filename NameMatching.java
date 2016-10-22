package Practice;

public class NameMatching
{
    public static void main(String[] args)
    {
        String physicist1 = "Narendra";
        String physicist2 = "Ashish";
        String physicist3 = "Vasu";
        String physicist4 = "ashish";

        // Are any of the above Strings equal to one another?
        boolean equals1 = physicist1.equalsIgnoreCase(physicist2);
        boolean equals2 = physicist1.equalsIgnoreCase(physicist3);
        boolean equal3= physicist2.equalsIgnoreCase(physicist4);
        // Display the results of the equality checks.
        System.out.println("\"" + physicist1 + "\" equals \"" +
            physicist2 + "\"? " + equals1);
        System.out.println("\"" + physicist1 + "\" equals \"" +
            physicist3 + "\"? " + equals2);
        System.out.println("\"" + physicist2 + "\" equals \"" +
                physicist4 + "\"? " + equal3);
    }
}
