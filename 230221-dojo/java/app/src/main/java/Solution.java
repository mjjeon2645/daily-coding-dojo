import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> toppings = new HashMap<>();

        for (int item : topping) {
            toppings.put(item, toppings.getOrDefault(item, 0) + 1);
        }

        Map<Integer, Boolean> brother = new HashMap<>();

        for (int item : topping) {
            toppings.put(item, toppings.get(item) - 1);

            brother.put(item, true);

            if (toppings.get(item) == 0) {
                toppings.remove((item));
            }

            if (toppings.size() == brother.size()) {
                answer += 1;
            }

            if (toppings.size() < brother.size()) {
                break;
            }
        }

        return answer;
    }
}
