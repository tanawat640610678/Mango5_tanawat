class StackOverflow {
  public static void test(int i) {
    if (i == 0)
      return;
    else 
      test(i++);
  }
}

public class ErrorExample {
  public static void main(String[] args) {
    StackOverflow.test(5);
  }
}