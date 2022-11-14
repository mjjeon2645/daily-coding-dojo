class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        if (arr.length == 1) {
            return arr[0];
        }

       answer = process(arr);

        return answer;
    }

    public int process(int[] arr) {
        int standardNumber = arr[0];

        for (int number : arr) {
            standardNumber = findLcm(standardNumber, number);
        }

        return standardNumber;
    }

    public int findLcm(int a, int b) {
        int gcd = findGcd(a, b);
        return a * b / gcd;
    }

    public int findGcd(int a, int b) {
        while(b > 0) {
            int remain = a % b;
            a = b;
            b = remain;
        }

        return a;
    }
}
