public class PrintingTables {
  public static void main(String[] args) {
    int no = 4;
System.out.println("Following is the table of " + no + " from one to ten");
   table(no);

  }

  static void table(int number) {

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " X " + i + " = " +  number * i);
    }
    return;
  }
}