class Vehicle {
  int passengers;
  int fuelcap;
  int mpg;

  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelcap = f;
    mpg = m;
  }

  int range() {
    return fuelcap * mpg;
  }
}

class AddMeth {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle(7, 16, 21);
    Vehicle sportscar = new Vehicle(8, 9, 10);

    int range1, range2;

    System.out.print("Minivan can carry " + minivan.passengers + 
                     ". ");

    range1 = minivan.range();

    System.out.println("Minivan has range of " + range1);

    System.out.println("Sportscar can carry " + sportscar.passengers +
                     ". ");
  }
}
