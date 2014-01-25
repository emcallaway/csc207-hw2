package hw2;

public class TwoB
{
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   */
  public static int 
    average (int left, int right) 
  {
    return (int) ((left/2.0) + (right/2.0));
  } // average(int,int)
}// class TwoB


/*
HW Problem 2:

We corrected the way 'average' computed the average of the 
input numbers, because the original equation did not allow 
for (left + right) to be greater or equal to the MAX_VALUE 
or less than or equal to the MIN_VALUE, even if the input 
numbers were themselves within the accepted range.  


*/