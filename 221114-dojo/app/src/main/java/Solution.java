import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        if (arr.length == 1) {
            return arr[0];
        }

        Arrays.stream(arr).sorted();

        // 약수를 구해보자
        int[] array = process(arr);


        return answer;
    }

    public int[] process(int[] arr) {
        int maxNumber = arr[arr.length - 1];

        int i = 1;

        while (i < arr.length) {

        }

        return new int[0];
    }
}
