class Solution {
    public int solution(int n, int a, int b) {
        int round = 1;

        while (true) {
            boolean isMatching = validation(a, b);

            if (isMatching) {
                return round;
            }

            round += 1;

            a = renumbering(a);
            b = renumbering(b);
        }
    }


    public boolean validation(int a, int b) {
        if ((a % 2 == 0) && (a - 1 == b)) {
            return true;
        }

        if ((b % 2 == 0) && (b - 1 == a)) {
            return true;
        }
        return false;
    }

    public int renumbering(int number) {
        if (number % 2 == 0) {
            return number / 2;
        }
        return number / 2 + 1;
    }
}
