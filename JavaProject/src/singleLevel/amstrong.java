package inhertiance;

public class amstrong {
	public static void main(String[] args) 
	{
		int n = 153;
		int temp =n;
		int rem =0;
		int sum =0;
		while (n!=0)
		{
			rem = n%10;
			sum = sum+(rem*rem*rem);
			n = n/10;
		}
		if (sum==temp)
		{
			System.out.println("153 is a amstrong number");
		}
		else {
			System.out.println("153 is not a amstrong number");
		}
	}

}

	


