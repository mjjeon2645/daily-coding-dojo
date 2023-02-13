class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] convertedArray1 = convertToBinary(n, arr1);
        String[] convertedArray2 = convertToBinary(n, arr2);

        return convertToEncodedMap(n, convertedArray1, convertedArray2);
    }

    public String[] convertToBinary(int n, int[] array) {
        String[] convertedArray = new String[n];

        for (int i = 0; i < n; i += 1) {
            String accumulator = "";
            int number = array[i];

            while(number > 0) {
                int remain = number % 2;
                accumulator = remain + accumulator;
                number = number / 2;
            }

            if (accumulator.length() < n) {
                String zeroCharacter = "";
                for (int j = 0; j < n - accumulator.length(); j += 1) {
                    zeroCharacter += "0";
                }
                accumulator = zeroCharacter + accumulator;
            }
            convertedArray[i] = accumulator;
        }
        return convertedArray;
    }

    public String[] convertToEncodedMap(int n, String[] array1, String[] array2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i += 1) {
            String accumulator = "";
            int cycle = 0;

            while (cycle < n) {
                if (array1[i].charAt(cycle) == '0' && array2[i].charAt(cycle) == '0') {
                    accumulator += " ";
                    cycle += 1;
                    continue;
                }

                accumulator += "#";
                cycle += 1;
            }

            result[i] = accumulator;
        }
        return result;
    }
}