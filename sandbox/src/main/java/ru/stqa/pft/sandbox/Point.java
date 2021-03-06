package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;


  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
    public double distance(double x, double y) {
    double dx = this.x - x;
    double dy = this.y - y;
      return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(Point p) {
    return distance(p.x, p.y);
    }


}
