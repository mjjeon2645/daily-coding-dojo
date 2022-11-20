import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int hit = 1;
        int miss = 5;

       if (cacheSize == 0) {
           return cities.length * miss;
       }

       int answer = 0;

       LinkedList<String> cache = new LinkedList<>();

       for (int i = 0; i < cities.length; i += 1) {
           String convertedWord = cities[i].toLowerCase();

           if (cache.remove(convertedWord)) {
               answer += hit;
               cache.add(convertedWord);
               continue;
           }

           if (!cache.remove(convertedWord)) {
               answer += miss;
               if (cache.size() >= cacheSize) {
                   cache.remove(0);
               }
               cache.add(convertedWord);
           }
       }
       return answer;
    }
}
