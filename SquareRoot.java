//	BIG( O ) OF ALL 3 METHODS IS O( LOG N ). BUT NEWTON'S METHOD IS THE MOST EFFICIENT AND FAST

//	1.	NEWTON'S METHOD
//  2.  BINARY SEARCH METHOD
//	3.	LONG DIVISION METHOD ( CLASSICAL NEWTON'S METHOD )

public static SquareRoot{
	
    public static double newtonSqrt( double number )	//	NEWTON'S METHOD
    {
        if( number < 0 )
	    {
		    return -1 ;
	    }

	    if( number < 2 )
	    {
		    return number ;
	    }

	    double guess	= number / 2.0	;
	    double epsilon	= 0.000001 		;	 

	    while( guess * guess - number  >  epsilon )
	    {
		    guess = ( guess + number / guess ) / 2.0	;
	    }

	    return guess	;

    }    //    END OF NEWTON'S METHOD



	//    BINARY SEARCH METHOD

	public static double binarySearchSqrt( double number )
	{
		if( number < 0 )
    	{
            return -1 ;
    	}

		if( number < 2 )
		{
			return number ;
		}

		double start		=  0	;
		double end		    =  number	 ;
		double epsilon	    =  0.000001 ;
		double guess		=  0 	;

		while( end - start > epsilon )
		{
			guess = ( start + end ) / 2 ;
			
			if( guess * guess > number )
			{
				end = guess ;
			}
			else
			{
				start = guess ;
			}

		}
		
		return guess ;

	}    //   END OF BINARY SEARCH METHOD



//    LONG DIVISION METHOD
public static double ldSqrt( double number )
	{
		if( number < 0 )
    	{
        return -1 ;
    	}

		if( number < 2 )
		{
			return number ;
		}

		double guess		=  number / 2 ;
		double epsilon	    =  0.000001 ;
		double sqrtApprox	=  0 	;

		while( Math.abs( guess - sqrtApprox ) > epsilon )
		{
			sqrtApprox	= guess ;
			guess			= ( guess + number / guess ) / 2.0 ;
		}

		return guess ;

	}    //    END OF LONG DIVISION METHOD
				
}    //    END OF SQUAREROOT CLASS
			
