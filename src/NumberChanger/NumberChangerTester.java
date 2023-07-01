package NumberChanger;
import java.util.Scanner;

/**
 * A class that tests the NumberChanger class.
 */
public class NumberChangerTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int input;
		String inp;
		do
		{
			System.out.print("Please enter a number at least 3 digits long: ");
			inp = in.next();
			if(inp.contains("[a-zA-Z]+") == false)
			{
				try {
					   input = Integer.parseInt(inp);
					}
					catch (NumberFormatException e)
					{
						System.out.println("Please enter numbers only.");
						input = 0;
					}
			}
			else 
			{
				input = 0;
			}
		} while(input/100<=0);
		input%=1000;
		NumberChanger num = new NumberChanger(input);
		System.out.println(num.output());
		System.out.println(num.reverse());
		System.out.println(num.difference());
		System.out.println(num.reverseDifference());
		System.out.println(num.sum());
		in.close();
	}
}