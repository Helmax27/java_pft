package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testDistance() {
    Point p1 = new Point(8.0, 9.0);
    Point p2 = new Point(7.0, 8.0);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
  }
}
