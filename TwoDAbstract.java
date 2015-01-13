abstract class TwoDShape {
  private double width;
  private double height;
  private String name;

  //A Default constructor
  TwoDShape() {
    width = height = 0.0;
    name = "none";
  }

  //Parameterized constructor.
  TwoDShape(double w, double h, String n) {
    width = w;
    height = h;
    name = n;
  }

  // Construct object with equal with and height
  TwoDShape(double x, String n) {
    width = height = x;
    name = n;
  }

  //Construct an object from an object
  TwoDShape(TwoDShape ob) {
    width = ob.width;
    height = ob.height;
    name = ob.name;
  }

  //Accessor methods for width and heigh
  double getWidth() { return width; }
  double getHeight() { return height; }
  void setWidth(double w) { width = w; }
  void setHeight(double h) { height = h; }

  String getName() { return name; }

  void showDim() {
    System.out.println("Width and height are " + width + " and " +
      height);
  }

  //Now, area() is abstract
  abstract double area();
}

  //A subclass of TwoDShape for triangles.
class Triangle extends TwoDShape {
  private String style;

  //must define are as it is empty in abstract
  double area() { 
    return getwidth
  }
}


