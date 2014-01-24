package hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA
{

  @Test
  public void
    test_isMultiple ()
  {
    assertEquals("8 and 4", true, TwoA.isMultiple (8, 4)); 
    assertEquals("4 and -2", true, TwoA.isMultiple (4, -2));
    assertEquals("-2 and -4", false, TwoA.isMultiple (-2, -4));
    assertEquals("0 and 3", true, TwoA.isMultiple (0, 3));
    assertEquals("3 and 0", false, TwoA.isMultiple (3, 0));
    assertEquals("5 and 3", false, TwoA.isMultiple (5, 3));
    assertEquals("345634 and 2", true, TwoA.isMultiple (345634, 2));
  }
  @Test
  public void
    test_isOdd ()
  {
    assertEquals("2", false, TwoA.isOdd (2)); 
    assertEquals("-2", false, TwoA.isOdd (-2)); 
    assertEquals("23623", true, TwoA.isOdd (23623)); 
    assertEquals("0", false, TwoA.isOdd (0)); 
  }
}
