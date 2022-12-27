class Solution {
    public int[] solution(int n, int m) {
        int smallNumber = n;

        if (smallNumber > m) {
            smallNumber = m;
            m = n;
        }

        int gcd = getGcd(smallNumber, m);

        int lcm = getLcm(gcd, smallNumber, m);

        return new int[]{gcd, lcm};
    }

    public int getGcd(int smallNumber, int m) {
        for (int i = smallNumber; i > 0; i -= 1) {
            if (smallNumber % i == 0 && m % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public int getLcm(int gcd, int smallNumber, int m) {
        if (m % smallNumber == 0) {
            return m;
        }

        int accumulator = 1;

        while (true) {
            if (gcd > 1 && smallNumber % gcd == 0 && m % gcd == 0) {
                accumulator *= gcd;
                smallNumber /= gcd;
                m /= gcd;
                continue;
            }

            return accumulator * smallNumber * m;
        }
    }
}
