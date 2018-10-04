import java.util.Scanner;

public class Main
{
  
	public static void main(String[] args) 
	{
  
		Scanner input=new Scanner(System.in);
  
		System.out.println("enter the string");
 //taking the input from the user  
		char[] s = input.nextLine().toCharArray();
  // input form user
		System.out.println("reverse string is");
  
		for(int i = s.length-1;i>=0;i--)
		{
    
			System.out.print(s[i]);
  // dispalying the reverse of the string
		}
	
}

}
