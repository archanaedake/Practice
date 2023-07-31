package String;

public class Noofvowels2 {
	public static void main(String[] args) {
		String m ="Aasam";
		String v ="";
		int count=0;
		for(int i=0; i<=m.length()-1; i++)
		{
			char t= m.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
			{
				count ++;
			}
			
		}
		System.out.println("Number of vowels are"+ count);
				
		
	}
	
}
