package String;

public class Palandrom2 {
	public static void main(String[] args) {
		String x ="Pune";
				String rev ="";
		for(int i=x.length()-1; i>=0; i--)
		{
			rev=rev+x.charAt(i);
		}
		System.out.println(x);
		System.out.println(rev);
		if(x.equals(rev))
		{
			System.out.println("Given String is in Palindrom");
		}
		else
		{
			System.out.println("Given String is not inPalindrom");
		}
			
				
	}

}
