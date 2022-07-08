public class SolutionClone {
  public String[] solution(int length, int[] array1, int[] array2) {
    String[] binaryArray1 = new String[length];
    String[] binaryArray2 = new String[length];

    for (int i = 0; i < length; i += 1) {
      binaryArray1[i] = decimalToBinary(array1[i], length);
      binaryArray2[i] = decimalToBinary(array2[i], length);
    }
    return makeSecretMap(length, binaryArray1, binaryArray2);
  }

  public String decimalToBinary(int decimalNumber, int length) {
    String binaryNumber = "";

    int dividend = decimalNumber;

    while (dividend > 0) {
      int remainder = dividend % 2;

      binaryNumber = remainder + binaryNumber;

      dividend /= 2;
    }

    while (binaryNumber.length() < length) {
      binaryNumber = "0" + binaryNumber;
    }

    return binaryNumber;
  }

  public String[] makeSecretMap(int length, String[] binaryArray1, String[] binaryArray2) {
    String[] secretMap = new String[length];

    for (int i = 0; i < length; i += 1) {
      String secretMapElement = "";

      for (int j = 0; j < length; j += 1) {
        secretMapElement = secretMapElement + (
            binaryArray1[i].charAt(j) == '0' && binaryArray2[i].charAt(j) == '0'
                ? " "
                : "#"
        );

        secretMap[i] = secretMapElement;
      }
    }
    return secretMap;
  }
}
