package java8;

import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class
import java.util.Comparator;

public class DescSort{
  public static void main(String[] args) {
    ArrayList<String> myNumbers = new ArrayList<String>();
    myNumbers.add("abc");
    myNumbers.add("bcd");
    myNumbers.add("fgh");
    myNumbers.add("cde");
    myNumbers.add("def");
    myNumbers.add("efg");

   // Collections.sort(myNumbers, Comparator.reverseOrder());  // Sort myNumbers
    Collections.reverse(myNumbers);
    for (String i : myNumbers) {
      System.out.println(i);
    }
  }
}