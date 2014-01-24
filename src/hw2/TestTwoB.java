package hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoB
{

  @Test
  public void
    testAverage ()
  {
    assertEquals ("3 and 4", 3, TwoB.average (3, 4));
    assertEquals ("-2 and -5", -3, TwoB.average (-2, -5));
    assertEquals ("-2 and 3", 0, TwoB.average (-2, 3));
    assertEquals ("2 and 2", 2, TwoB.average (2, 2));
  }

}
