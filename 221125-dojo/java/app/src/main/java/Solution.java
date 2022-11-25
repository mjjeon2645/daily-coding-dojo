class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        if (numbers.length == 2) {
            if(numbers[0] == numbers[1] && numbers[0] + numbers[1] == target) {
                return 1;
            }
        }
        return answer;
    }
}
