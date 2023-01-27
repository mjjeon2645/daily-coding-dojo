import java.math.*;

class Result {
    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        // Write your code here

        BigInteger accumulate = new BigInteger("1");

        for (int i = 1; i <= n; i += 1) {
            accumulate = accumulate.multiply(BigInteger.valueOf(i));
        }

        System.out.println(accumulate);
    }

}
