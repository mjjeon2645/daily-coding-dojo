class Solution {
  public String solution(String s) {
    String convertedString = toLower(s);

    String[] arrayOfString = toArray(convertedString);

    return makeAnswer(arrayOfString);
  }

  public String toLower(String s) {

    return s.toLowerCase();
  }

  public String[] toArray(String s) {
    return s.split(" ", -1);
  }

  public String makeAnswer(String[] array) {
    for (int i = 0; i < array.length; i += 1) {
      if (array[i].equals("")) {
        continue;
      }
      array[i] = Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1);
    }
    return String.join(" ", array);
  }
}
