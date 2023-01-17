class Solution {
    public long solution(int price, int money, int count) {
        long remain = money;

        for (int i = 1; i <= count; i += 1) {
            remain -= (long) price * i;
        }

        return remain < 0 ? Math.abs(remain) : 0;
    }
}
