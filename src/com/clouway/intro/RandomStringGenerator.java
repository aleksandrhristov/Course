package com.clouway.intro;

import java.util.Random;

/**
 *
 */
public class RandomStringGenerator {


  /**
   * generates random string with users choice of possible chars and length
   *
   * @param length     integer specifying the length of the string
   * @param start integer specifying the first possible char from the Unicode table
   * @param end   integer specifying the last char possible from the Unicode table
   * @return the random String
   */
  public String generate(int length, int start, int end) {
    String rs;
    Random numb = new Random();
    int randNumb = numb.nextInt(end - start) + start;
    rs = Character.toString((char) randNumb);
    for (int s = 0; s < length; s++) {
      int randNum = numb.nextInt(end - start) + start;
      rs += (char) randNum;
    }
    return rs;
  }
}
