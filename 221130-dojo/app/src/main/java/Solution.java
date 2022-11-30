import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] convertedArray = convertToArray(s);

        String[] sortedArray = sortedArray(convertedArray);

        process(sortedArray);

        return answer;
    }

    public String[] convertToArray(String s) {
        return s.substring(2, s.length() - 2).split("},\\{");
    }

    public String[] sortedArray(String[] array) {
        Arrays.sort(array, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        return array;
    }

    public void process(String[] sortedArray) {
        int[] answer = new int[sortedArray[sortedArray.length - 1].length()];

        answer[0] = Integer.parseInt(sortedArray[0]);
    }
}
