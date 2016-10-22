package Practice;
public class CharPalindrome {
public static void main(String [] args){

	
	Palindrome pn = new Palindrome();
	 
	if (pn.isPalindrome(i)){
   
		System.out.println("PALINDROME");
	}
	else{
		System.out.println("Not Palindrome");
	}
}

public boolean isPalindrome (String original){
	int i = original.length()-1;
	int j=0;
	while (i>j)
	{
		if (original.charAt(i)!=original.charAt(j)){
			return false;
		}
		i--;
		j++;
	}
	return false;
	
}

public boolean isPalindrome(String original){

    int i = original.length()-1;
    int j=0;
    while(i > j){
        if(original.charAt(i) != original.charAt(j)){
            return false;
        }
        i--;
        j++;
    }
    return true;
}