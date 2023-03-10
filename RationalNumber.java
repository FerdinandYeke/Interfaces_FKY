//********************************************************************
//  RationalNumber.java       Java Foundations
//
//  Represents one rational number with a numerator and denominator.
//********************************************************************

public class RationalNumber implements Comparable <RationalNumber>
{
    private int numerator, denominator;
    public final double TOLERANCE = 0.0001;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(int numer, int denom)
    {
        if (denom == 0)
            denom = 1;

        // Make the numerator "store" the sign
        if (denom < 0)
        {
            numer = numer * -1;
            denom = denom * -1;
        }

        numerator = numer;
        denominator = denom;

        reduce();
    }

    //-----------------------------------------------------------------
    //  Returns the numerator of this rational number.
    //-----------------------------------------------------------------
    public int getNumerator()
    {
        return numerator;
    }

    //-----------------------------------------------------------------
    //  Returns the denominator of this rational number.
    //-----------------------------------------------------------------
    public int getDenominator()
    {
        return denominator;
    }

    //-----------------------------------------------------------------
    //  Returns the reciprocal of this rational number.
    //-----------------------------------------------------------------
    public RationalNumber reciprocal()
    {
        return new RationalNumber(denominator, numerator);
    }

    //-----------------------------------------------------------------
    //  Adds this rational number to the one passed as a parameter.
    //  A common denominator is found by multiplying the individual
    //  denominators.
    //-----------------------------------------------------------------
    public RationalNumber add(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;

        return new RationalNumber(sum, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Subtracts the rational number passed as a parameter from this
    //  rational number.
    //-----------------------------------------------------------------
    public RationalNumber subtract(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;

        return new RationalNumber(difference, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Multiplies this rational number by the one passed as a
    //  parameter.
    //-----------------------------------------------------------------
    public RationalNumber multiply(RationalNumber op2)
    {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();

        return new RationalNumber(numer, denom);
    }

    //-----------------------------------------------------------------
    //  Divides this rational number by the one passed as a parameter
    //  by multiplying by the reciprocal of the second rational.
    //-----------------------------------------------------------------
    public RationalNumber divide(RationalNumber op2)
    {
        return multiply(op2.reciprocal());
    }

    //-----------------------------------------------------------------
    //  Determines if this rational number is equal to the one passed
    //  as a parameter. Assumes they are both reduced.
    //-----------------------------------------------------------------
    public boolean isLike(RationalNumber op2)
    {
        return (numerator == op2.getNumerator() &&
                denominator == op2.getDenominator());
    }

    //-----------------------------------------------------------------
    //  Returns this rational number as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;
        
        if (numerator == 0)
            result = "0";
        else
            if (denominator == 1)
                result = numerator + "";
            else
                result = numerator + "/" + denominator;
        
        return result;
    }

    //-----------------------------------------------------------------
    //  Reduces this rational number by dividing both the numerator
    //  and the denominator by their greatest common divisor.
    //-----------------------------------------------------------------
    private void reduce()
    {
        if (numerator != 0)
        {
            int common = gcd(Math.abs(numerator), denominator);

            numerator = numerator / common;
            denominator = denominator / common;
        }
    }

    //-----------------------------------------------------------------
    //  Computes and returns the greatest common divisor of the two
    //  positive parameters. Uses Euclid's algorithm.
    //-----------------------------------------------------------------
    private int gcd(int num1, int num2)
    {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        return num1;
    }

	@Override
	public int compareTo(RationalNumber o) {
		// TODO Auto-generated method stub
		
		int final_result = 0;
		
		
		this.numerator = numerator;
		this.denominator = denominator;
		
		/*This converts the numerator subtracted
		/by the denominator, and stores them as
		a float variable that is final_result
		*/
		float num_result = o.getNumerator() / o.getDenominator();
		
		
		//1e-9 (1*(Math.E) -9) is the tolerance level (0.0001)
		
		/*If the num_result is less than the
		 * tolerance level, then it prints out
		 * negative 1 
		 */
		if(Math.abs(num_result)< 1e-9)
		{
			final_result = -1;
		}
		
		/*If the num_result is equal to
		 * the tolerance level, than it 
		 * prints out 0
		 */
		else if(Math.abs(num_result) == 1e-9)
		{
			final_result = 0;
		}
		
		/*If the num_result is greater than
		 * the tolerance level, then it prints
		 * out 1.
		 */
		else if(Math.abs(num_result)> 1e-9)
		{
			final_result = 1;
		}
		
		System.out.println(num_result);
		
		return final_result;
		
		
	}
}
