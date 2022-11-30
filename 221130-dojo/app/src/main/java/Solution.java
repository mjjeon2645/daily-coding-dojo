import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        s = s.replace("{", "");
        s = s.replace("},", "-");
        s = s.replace("}}", "");

        String[] array = s.split("-");
        Arrays.sort(array, new Comparator<String>() {
            public int compare(String o1, String o2) {

                return Integer.compare(o1.length(), o2.length());
            }
        });

        for (int i = 0; i < array.length; i += 1) {
            String[] chars = array[i].split(",");
            for (int j = 0; j < chars.length; j += 1) {
                int num = Integer.parseInt(chars[j]);
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }
        return list;
    }
}

//import java.util.*;
//
//class Solution {
//    public int[] solution(String s) {
//        int[] answer = {};
//        String[] convertedArray = convertToArray(s);
//
//        String[] sortedArray = sortedArray(convertedArray);
//
//        process(sortedArray);
//
//        return answer;
//    }
//
//    public String[] convertToArray(String s) {
//        return s.substring(2, s.length() - 2).split("},\\{");
//    }
//
//    public String[] sortedArray(String[] array) {
//        Arrays.sort(array, new Comparator<String>() {
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        });
//
//        return array;
//    }
//
//    public void process(String[] sortedArray) {
//        int[] answer = new int[sortedArray[sortedArray.length - 1].length()];
//
//        answer[0] = Integer.parseInt(sortedArray[0]);
//    }
//}
