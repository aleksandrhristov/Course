package com.clouway.exceptions.sumator;

/**
 * @author raikov.krasimir@gmail.com (Krasimir Raikov)
 */
public class Executor {
  public static void main(String[] args) {
    StringSumator sumator = new StringSumator();

    if (sumator.sum("404", "2")==404101) {
      System.out.println("Sorry ");
    } else {
      System.out.println(404101);
    }


  }

}
