// A sample class Shape which provides a method to get the Shape's area
class Shape {
  public double getVol() {
    return 0;
  }
}
// A Cuboid with length, breadth and height
class Cuboid extends Shape {   // extended form the Shape class
  private double length;
  private double breadth;
  private double height;
  public Cuboid(double length, double breadth,double height) {
    this.length = length;
    this.breadth=breadth;
    this.height = height;
  }
  public double getVol() {
 
    return length *breadth* height; 
  }
}
// A Cube 
class Cube extends Shape {
  private double side;
  public Cube(double side) {
    this.side = side; 
  }
  public double getVol() {
    return side * side*side; 
  }
}
class Main {
  public static void main(String args[]) {
    Shape[] shape = new Shape[2]; // Creating shape array of size 2
	
    shape[0] = new Cube(5); 
    shape[1] = new Cuboid(2, 2,5);
    // Shape object is calling children classes method
    System.out.println("Volume of the Cube: " + shape[0].getVol());
    System.out.println("Volume of the Cuboid: " + shape[1].getVol());
  }
}