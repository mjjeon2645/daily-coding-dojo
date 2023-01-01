import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        String[] words = s.split("");

        return Arrays.stream(words).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
}

//class Solution {
//    public String solution(String s) {
//        String[] words = s.split("");
//
//        Arrays.sort(words, Collections.reverseOrder());
//
//        return String.join("", words);
//    }
//}
