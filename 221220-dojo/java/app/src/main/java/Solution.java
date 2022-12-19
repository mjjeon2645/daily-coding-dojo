class Solution {
    public long solution(int price, int money, int count) {
        long total = calculate(price, count);

        return money - total < 0 ? (money - total) * -1 : 0;
    }

    public long calculate(int price, int count) {
        long total = 0;

        for(int i = 1; i <= count; i += 1) {
            total += (long) price * i;
        }

        return total;
    }
}
