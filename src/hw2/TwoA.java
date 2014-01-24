package hw2;

public class TwoA
{
  public static boolean
    isMultiple (long a, long b)
  {
    boolean multInt = false;
    long i = a / b;
    if ((int) i * b == a)
      {
        multInt = true;
      }
    return multInt;
  }

  public static boolean
    isOdd (int i)
  {
    boolean odd = false;
    int test = (int) Math.pow (-1, i);
    if (test == -1)
      {
        odd = true;
      }
    return odd;
  }

  public static int
    oddSumTo (int n)
  {
    int sum = 0;
    for (int j = 1; j < n; j += 2)
      {
        sum += j;
      }
    return sum;
  }

  public static boolean
    isOddProd (int[] ints)
  {
    boolean oddCount = false;
    for (int l = 0; l < ints.length; l++)
      {
        for (int m = 1; m < ints.length; m++)
          {
            if (isOdd (ints[l] * ints[m]))
              {
                oddCount = true;
              }
          }
      }
    return oddCount;
  }
}
