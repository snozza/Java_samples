class VarArgs {

  // vaTest() uses vararg.
  static void vaTest(int ... v) {
    System.out.println("Number of args: " + v.length);
    System.out.println("Contents: ");

    for(int i = 0; i < v.length; i++) 
      System.out.println(" arg " + i + ": " + v[i]);
    
    System.out.println();
    }
    public static void main(String args[])
    {
        //vaTest can be called with variable num of args
      vaTest(10);
      vaTest(1, 2, 3);
      vaTest();
    }
}


