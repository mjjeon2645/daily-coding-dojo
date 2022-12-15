import java.util.*;

class Solution {
    public boolean solution(int x) {
        int number = process(x);

        return x % number == 0;
    }

    public int process(int x) {
        String[] numbers = Integer.toString(x).split("");

        int sum = Arrays.stream(numbers).map(Integer::parseInt).mapToInt(number -> number).sum();

        return sum;
    }

// 이 솔루션이 왜 안되는건지 너무 궁금하다. 엣지케이스가 무엇인지 잘 모르겠음...
//    public int process(int x, int accumulator) {
//        int exponent = (int) Math.log10(x);
//        int dividend = (int) Math.pow(10, exponent);
//
//        accumulator += x / dividend;
//        int remain = x % dividend;
//
//        if (remain / 10 == 0) {
//            accumulator += remain;
//            return accumulator;
//        }
//
//        if (remain / 10 != 0) {
//            process(remain, accumulator);
//        }
//
//        return accumulator;
//    }
}
