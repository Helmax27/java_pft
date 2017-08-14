package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String args[]) {

  Point p1 = new Point(8.0, 9.0);
  Point p2 = new Point(7.0, 8.0);
  System.out.println("Расстояние между двумя точками " + " = " + p1.distance(p2));

  }

}