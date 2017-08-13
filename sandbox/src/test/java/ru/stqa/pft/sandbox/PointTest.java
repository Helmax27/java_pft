package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance() {
    Point p = new Point(8.0, 9.0, 7.0, 8.0);
    Assert.assertEquals(p.distance(), 1.41);
  }
}
