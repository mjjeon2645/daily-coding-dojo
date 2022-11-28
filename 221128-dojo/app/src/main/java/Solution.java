class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0; i < answer.length; i += 1){
            for(int j = 0; j < answer[0].length; j += 1){
                int sum = 0;
                for(int k = 0; k < arr2.length; k += 1){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}
