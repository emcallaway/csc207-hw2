package hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA
{
  @Test
  public void
    test_isMultiple ()
  {
    assertEquals ("8 and 4", true, TwoA.isMultiple (8, 4));
    assertEquals ("4 and -2", true, TwoA.isMultiple (4, -2));
    assertEquals ("-2 and -4", false, TwoA.isMultiple (-2, -4));
    assertEquals ("0 and 3", true, TwoA.isMultiple (0, 3));
    assertEquals ("3 and 0", false, TwoA.isMultiple (3, 0));
    assertEquals ("5 and 3", false, TwoA.isMultiple (5, 3));
    assertEquals ("345634 and 2", true, TwoA.isMultiple (345634, 2));
  }// test_isMultiple

  @Test
  public void
    test_isOdd ()
  {
    assertEquals ("2", false, TwoA.isOdd (2));
    assertEquals ("-2", false, TwoA.isOdd (-2));
    assertEquals ("23623", true, TwoA.isOdd (23623));
    assertEquals ("0", false, TwoA.isOdd (0));
    for (int i = -200; i <= 200; i += 2)
      {
        assertEquals ("i", false, TwoA.isOdd (i));
      }// for
    for (int i = -201; i <= 199; i += 2)
      {
        assertEquals ("i", true, TwoA.isOdd (i));
      }// for
  }// test_isOdd

  @Test
  public void
    test_oddSumTo ()
  {
    assertEquals ("34", 289, TwoA.oddSumTo (34));
    assertEquals ("23", 121, TwoA.oddSumTo (23));
    assertEquals ("-6", 0, TwoA.oddSumTo (-6));
    assertEquals ("1", 0, TwoA.oddSumTo (1));
    assertEquals ("58", 841, TwoA.oddSumTo (58));
  }// test_oddSumTo

  @Test
  public void
    test_isOddProd ()
  {
    int[] array = { 2, 4, 6, 8 };
    int[] array2 = { 2, 7, 6, 8 };
    int[] array3 = { 3, 7, 5, 9 };
    int[] array4 = { 2, 7, 9, 6 };
    int[] array5 = { 24, 7, 90, 655 };
    int[] array6 = { 24, -7, -7, 655 };
    assertEquals ("{2, 4, 6, 8}", false, TwoA.isOddProd (array));
    assertEquals ("{2, 7, 6, 8}", false, TwoA.isOddProd (array2));
    assertEquals ("{3, 7, 5, 9}", true, TwoA.isOddProd (array3));
    assertEquals ("{2, 7, 9, 6}", true, TwoA.isOddProd (array4));
    assertEquals ("{24, 7, 90, 655}", true, TwoA.isOddProd (array5));
    assertEquals ("{24, -7, -7, 655}", true, TwoA.isOddProd (array6));
  }// test_isOddProd

  @Test
  public void
    test_allDistinct ()
  {
    int[] array = { 2, 4, 6, 8 };
    int[] array2 = { 2, 6, 6, 8 };
    int[] array3 = { 3, 7, 5, 9999 };
    int[] array4 = { 2, 9999, 9999, 6 };
    int[] array5 = { -24, 24, 90, 655 };
    assertEquals ("{2, 4, 6, 8}", true, TwoA.allDistinct (array));
    assertEquals ("{2, 6, 6, 8}", false, TwoA.allDistinct (array2));
    assertEquals ("{3, 7, 5, 9999}", true, TwoA.allDistinct (array3));
    assertEquals ("{2, 9999, 9999, 6}", false, TwoA.allDistinct (array4));
    assertEquals ("{-24, 24, 90, 655}", true, TwoA.allDistinct (array5));
  }// test_allDistinct

  @Test
  public void
    test_reverseInts ()
  {
    for (int i=2; i<117; i++)
      {
        int[] array1 = new int[i];
        int[] array2 = new int[i];
        for (int j=0; j<i; j++)
          {
            array1[j] = j+1;
            array2[(i-1)-j] = j+1;
          }//for j
        assertArrayEquals (array2, TwoA.reverseInts (array1));
      }//for i
  }// test_reverseInts
  
}// TestTwoA
