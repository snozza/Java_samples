class UpCase {
  public static void main(String args[]) {
    char ch;

    for(int i=0; i < 10; i++) {
      ch = (char) ('a' + i);
      System.out.print(ch);
      ch = (char) ((int) ch & 65503); //65503 is 1111 1111 1101 111 upercase mask

      System.out.print(ch + " ");
    }
  }
}