package Practice;

public class Palind {

	public static void main(String[] args) {
	int a, r, sum=0;
	a =2454542; //Input Number
	int temp = a; 
	while (a>0){
		r=a%10; //Getting remainder 
		sum = (sum*10)+r; 
		a=a/10;
	}
	if (temp == sum) //Verification
	{
		System.out.println("Pass");
	}
	else
	{ 
		System.out.println("Fail");
	}

	}

}
