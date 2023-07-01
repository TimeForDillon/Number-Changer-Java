package NumberChanger;
/**
 * Mathematically manipulates number to produces a common output.
 */
public class NumberChanger
{
	private int input;
	private int reverseInput;
	private int difference;
	private int reverseDifference;
	private int sum;
	
	/**
	 * Constructs a NumberChanger and stores input.
	 * @param input user input number.
	 */
	public NumberChanger(int input)
	{
		this.input = input;
	}
	
	/**
	 * Output's the user input number.
	 * @return user input number.
	 */
	public int output()
	{
		return this.input;
	}
	
	/**
	 * Output's the input number reversed.
	 * @return input number reversed.
	 */
	public int reverse()
	{
		int inp = this.input;
		while(inp > 0)
		{
			this.reverseInput *= 10;
			this.reverseInput += inp%10;
			inp /= 10;
		}
		return this.reverseInput;
	}
	
	/**
	 * Output's the difference between reversed input and input.
	 * @return difference between reversed input and input.
	 */
	public int difference()
	{
		this.difference = (reverseInput - input);
		if(this.difference < 0) this.difference *= -1;
		return this.difference;
	}
	
	/**
	 * Output's the reversed difference.
	 * @return reversed difference.
	 */
	public int reverseDifference()
	{
		int inp = this.difference;
		while(inp > 0)
		{
			this.reverseDifference *= 10;
			this.reverseDifference += inp%10;
			inp /= 10;
		}
		return this.reverseDifference;
	}
	
	/**
	 * Output's the sum of the difference and reversed difference.
	 * @return sum of the difference and reversed difference.
	 */
	public int sum()
	{
		this.sum = this.difference + this.reverseDifference;
		return sum;
	}
}
