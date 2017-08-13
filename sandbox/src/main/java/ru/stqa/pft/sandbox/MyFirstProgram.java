package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {


  Point p1 = new Point(8.0, 9.0);
  Point p2 = new Point(7.0, 8.0);
  System.out.println("Расстояние между двумя точками " + " = " + distance(p1, p2));


  }
  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
  }

}