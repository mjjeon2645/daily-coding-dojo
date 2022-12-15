class Solution {
    public int solution(int num) {
//        if (num == 1) {
//            return 0;
//        }

        long convertedNumber = (long) num;

        int result = process(convertedNumber);

        return result;
    }

    public int process(long number) {
        for (int i = 0; i < 500; i += 1) {
            if (number == 1) {
                return i;
            }
            number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
        }
        return -1;
    }

//    public int process(long number) {
//    int count = 0;

//        while(number > 1) {
//            if (number % 2 == 0) {
//                number /= 2;
//                count += 1;
//
//                if (count == 500) {
//                    return -1;
//                }
//
//                if (number == 1) {
//                    return count;
//                }
//                continue;
//            }
//
//            number = number * 3 + 1;
//            count += 1;
//            if (count == 500) {
//                return -1;
//            }
//
//            if (number == 1) {
//                return count;
//            }
//        }
//
//        return count;
//    }
}
