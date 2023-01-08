class Solution {
    public int solution(int storey) {
        int accumulator = 0;

        while (storey > 0) {
            int remain = storey % 10;

            if (remain == 9) {
                accumulator += 1;
                storey += 1;
                storey /= 10;
                continue;
            }

            if (remain > 5) {
                accumulator += (10 - remain);
                storey /= 10;
                storey += 1;
                continue;
            }

            if (remain < 5) {
                accumulator += remain;
                storey /= 10;
                continue;
            }

            if (storey % 100 >= 90) {
                accumulator += (10 - remain);
                storey /= 10;
                storey += 1;
                continue;
            }

            accumulator += remain;
            storey /= 10;
        }

        return accumulator;
    }
}
