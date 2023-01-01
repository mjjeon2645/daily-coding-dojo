class Solution {
    public long solution(long n) {
        long answer = 0;

        if (n == 1) {
            return 4;
        }

        for (long i = 2; i < n; i += 1) {
            if (i * i == n) {
                return (i + 1)  * (i + 1);
            }
            answer = -1;
        }

        return answer;
    }
}

//class Solution {
//    public long solution(long n) {
//        long answer = -1;
//        long base = n;
//
//        while(true) {
//            if (base * base == n) {
//                answer = (base + 1) * (base + 1);
//                break;
//            }
//
//            if (base * base < n) {
//                break;
//            }
//
//            base /= 2;
//        }
//
//        if (answer != -1) {
//            return answer;
//        }
//
//        while(true) {
//            if (base * base == n) {
//                answer = (base + 1) * (base + 1);
//                break;
//            }
//
//            if (base * base > n) {
//                break;
//            }
//
//            base += 1;
//        }
//
//        return answer;
//    }
//}
