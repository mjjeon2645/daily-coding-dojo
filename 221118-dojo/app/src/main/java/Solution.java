import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int hit = 1;
        int miss = 5;

        Queue<String> words = new LinkedList<>();

        Arrays.stream(cities).map(String::toLowerCase);

        if (cacheSize == 0) {
            return cities.length * miss;
        }

        int i = 0;

        while (i < cities.length) {
            System.out.println("***");
            System.out.println(i);
            System.out.println(answer);
            System.out.println(words.size());
            System.out.println("***");

            if (i == 0) {
                words.add(cities[i]);
                answer += miss;
                i += 1;
                continue;
            }

            if (words.size() == cacheSize) {
                if (words.contains(cities[i])) {
                    answer += hit;
                    i += 1;
                    continue;
                }

                words.poll();
                words.add(cities[i]);
                answer += miss;
                i += 1;
                continue;
            }

            if (words.size() < cacheSize) {
                if (words.contains(cities[i])) {
                    answer += hit;
                    i += 1;
                    continue;
                }

                words.add(cities[i]);
                answer += miss;
                i += 1;
            }
        }

        return answer;
    }
}
