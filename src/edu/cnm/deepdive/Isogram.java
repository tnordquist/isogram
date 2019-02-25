package edu.cnm.deepdive;

/*
From Code Wars.
An isogram is a word that has no repeating letters, consecutive or
non-consecutive. Implement a function that determines whether a string that
contains only letters is an isogram. Assume the empty string is an isogram.
Ignore letter case.
 */

public class Isogram {

  public static boolean isIsogram(String str) {
    str = str.toLowerCase();
    boolean isIsogram = false;
    String currentLetter = "";
    String compareTo = "";

    if (str.equals("")) {
      return true;
    }
    for (int i = 0; i < str.length(); i++) {
      currentLetter = str.substring(i, i + 1);
      for (int j = i + 1; j < str.length(); j++) {
        compareTo = str.substring(j, j + 1);
        if (currentLetter.equals(compareTo)) {
          isIsogram = false;
          return isIsogram;
        } else {
          isIsogram = true;
        }

      }
    }
    return isIsogram;
  }

}
