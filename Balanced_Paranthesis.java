import java.io.*;
import java.util.*;

class Balanced_Paranthesis {
  static void generator(char arr[], int pos, int open, int close, int N, List < String > list) {
    if (pos == (2 * N)) {
      String s = "";
      for (int ii = 0; ii < 2 * N; ii++)
        s += String.valueOf(arr[ii]);
      list.add(s);
      return;
    }

    if (open > close) {
      arr[pos] = ')';
      generator(arr, pos + 1, open, close + 1, N, list);
    }
    if (open < N) {
      arr[pos] = '(';
      generator(arr, pos + 1, open + 1, close, N, list);
    }
    //return;
  }
  public static void main(String args[]) {

    /*Scanner object*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number:");
    int n = sc.nextInt();

    List < String > list = new ArrayList < > ();
    char arr[] = new char[2 * n];
    generator(arr, 0, 0, 0, n, list);

    for (String pair: list) {
      System.out.println(pair);
    }
  }
}
