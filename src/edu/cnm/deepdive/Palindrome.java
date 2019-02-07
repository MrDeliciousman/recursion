package edu.cnm.deepdive;

public class Palindrome {

  public static boolean test (String candidate) {
    String simpleCandidate = candidate.toLowerCase().replaceAll("[^a-z0-9]", "");
    //TODO assign simpleCandidate, stripping out spaces and punctuation.
    return testSimple(simpleCandidate);
  }
  private static boolean testSimple(String candidate) {
    boolean result = true;
    for (int i = 0, j = candidate.length() - 1; i < j / 2; i++, j--) {
      if (candidate.charAt(i) != candidate.charAt(j)) {
        result = false;
        break;
      }
    }
    return result;
  }

  }

