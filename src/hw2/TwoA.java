package hw2;

public class TwoA
{
  public static boolean
    isMultiple (long a, long b)
  {
    boolean multInt = false;
    if (b==0)
      {
        return multInt;
      } // if (b)
    long i = a / b;
    if ((int) i * b == a)
      {
        multInt = true;
      }// if
    return multInt;
  }// isMultiple

  public static boolean
    isOdd (int i)
  {
    boolean odd = false;
    if ((int) Math.pow (-1, i) == -1)
      {
        odd = true;
      }// if
    return odd;
  }// isOdd

  public static int
    oddSumTo (int n)
  {
    int sum = 0;
    for (int j = 1; j < n; j += 2)
      {
        sum += j;
      }// for
    return sum;
  }// oddSumTo

  public static boolean
    isOddProd (int[] ints)
  {
    boolean oddCount = false;
    for (int l = 0; l < ints.length; l++)
      {
        for (int m = l+1; m < ints.length; m++)
          {
            if (isOdd (ints[l] * ints[m]))
              {
                oddCount = true;
              }// if
          }// for(m)
      }// for(l)
    return oddCount;
  }// isOddProd

  public static boolean
    allDistinct (int[] vals)
  {
    boolean distinct = true;
    for (int n = 0; n < vals.length; n++)
      {
        for (int o = n+1; o < vals.length; o++)
          {
            if (vals[n] == vals[o])
              {
                distinct = false;
              }// if
          }// for(o)
      }// for(n)
    return distinct;
  }// allDistinct

  public static int[]
  reverseInts (int[] nums)
  {
  int temp;
  int len = nums.length - 1;
  for(int p = 0; p < len; p++)
    {
      temp = nums[p];
      nums[p] = nums[len];
      nums[len] = temp;
      len--;
    }//for(p)
    return nums;
  }//reverseInts
  
}// TwoA
