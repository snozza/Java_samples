class CastDemo {
  public static void main(String args[]) {
    double x, y;
    byte b;
    int i;
    char ch;

    x = 10.0;
    y = 3.0;

    i = (int) (x / y); //cast double to int
    b = (byte) i; //no loss of value byte can hold 100
    System.out.println("Value of b: " + b);

    i = 257;
    b = (byte) i;
    System.out.println("Value of b: " + b);

    b = 88; // ascii code for X
    ch = (char) b; //cast between two incomptible times
    System.out.println("ch: " + ch);
  }
}