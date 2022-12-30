class Solution {
    public int solution(int n) {
        int answer = 0;

        String number = reversedTernary(n);

        for (int i = 0; i < number.length(); i += 1) {
            char valueInChar = number.charAt(i);

            int value = Character.getNumericValue(valueInChar);

            answer += value * Math.pow(3, number.length() - 1 - i);
        }

        return answer;
    }

    public String reversedTernary(int n) {
        int divisor = 3;
        int dividend = n;
        String number = "";

        while(dividend > 0) {
            number += dividend % divisor;
            dividend /= divisor;
        }

        return number;
    }
}
