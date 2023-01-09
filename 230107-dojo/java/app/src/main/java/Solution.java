import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        Map<String, Integer> termsMap = new LinkedHashMap<>();

        termsArrayToMap(terms, termsMap);

        Map<Integer, String> privaciesMap = new LinkedHashMap<>();

        privaciesArrayToMap(privacies, privaciesMap);

        Map<Integer, String> personNumberWithExpiredDate = new LinkedHashMap<>();

        makeMapOfPersonNumberWithExpiredDate(termsMap, privaciesMap, personNumberWithExpiredDate);

        answer = process(today, personNumberWithExpiredDate);

        return answer;
    }

    public void termsArrayToMap(String[] terms, Map<String, Integer> termsMap) {
        for (String term : terms) {
            String[] results = term.split(" ");

            String category = results[0];
            int period = toInteger(results[1]);

            termsMap.put(category, period);
        }
    }

    public void privaciesArrayToMap(String[] privacies, Map<Integer, String> privaciesMap) {
        for (int i = 0; i < privacies.length; i += 1) {
            privaciesMap.put(i + 1, privacies[i]);
        }
    }

    public void makeMapOfPersonNumberWithExpiredDate(Map<String, Integer> termsMap,
                                                     Map<Integer, String> privaciesMap,
                                                     Map<Integer, String> personNumberWithExpiredDate) {

        for (int i = 1; i <= privaciesMap.size(); i += 1) {
            String[] value = privaciesMap.get(i).split(" ");

            String[] days = value[0].split("\\.");
            String category = value[1];

            int yearOfStart = toInteger(days[0]);
            int monthOfStart = toInteger(days[1]);
            int dateOfStart = toInteger(days[2]);

            int monthsToAdd = termsMap.get(category);

            if (dateOfStart == 1) {
                monthOfStart += (monthsToAdd - 1);
                dateOfStart = 28;

                if (monthOfStart > 12) {
                    yearOfStart += monthOfStart / 12;
                    monthOfStart = monthOfStart % 12;
                }

                personNumberWithExpiredDate.put(i, yearOfStart + "-" + monthOfStart + "-" + dateOfStart);
                continue;
            }

            monthOfStart += monthsToAdd;
            dateOfStart -= 1;

            if (monthOfStart > 12) {
                yearOfStart += monthOfStart / 12;
                monthOfStart = monthOfStart % 12;
            }

            personNumberWithExpiredDate.put(i, yearOfStart + "-" + monthOfStart + "-" + dateOfStart);
        }
    }

    public int[] process(String today, Map<Integer, String> personNumberWithExpiredDate) {
        List<Integer> results = new LinkedList<>();
        String[] todays = today.split("\\.");

        for (int i = 1; i <= personNumberWithExpiredDate.size(); i += 1) {
            String[] expiredDates = personNumberWithExpiredDate.get(i).split("-");

            if (toInteger(todays[0]) > toInteger(expiredDates[0])) {
                results.add(i);
                continue;
            }

            if (toInteger(todays[0]) < toInteger(expiredDates[0])) {
                continue;
            }

            if (toInteger(todays[1]) > toInteger(expiredDates[1])) {
                results.add(i);
                continue;
            }

            if (toInteger(todays[1]) < toInteger(expiredDates[1])) {
                continue;
            }

            if (toInteger(todays[2]) <= toInteger(expiredDates[2])) {
                continue;
            }

            results.add(i);
        }

        int[] answers = new int[results.size()];

        for (int j = 0; j < results.size(); j += 1) {
            answers[j] = results.get(j);
        }

        return answers;
    }

    public int toInteger(String day) {
        return Integer.parseInt(day);
    }
}
