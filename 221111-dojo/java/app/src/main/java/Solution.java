import java.util.*;

class Solution {
    public int[] solution(String msg) {

        // 사전 만들기 -> 해쉬맵으로 해보자.
        HashMap<String, Integer> dictionary = new HashMap<>();
        initDictionary(dictionary);

        // 인덱스 저장할 준비
        ArrayList<Integer> indexSet = new ArrayList<>();

        // 문자열을 순회할 준비
        int dictionaryIndex = 27;
        boolean isEnd = false;

        for (int i = 0; i < msg.length(); i += 1) {
            String word = msg.charAt(i) + "";

            while(dictionary.containsKey(word)) {
                i += 1;

                // 마지막 문자인지를 판단
                if (i == msg.length()) {
                    isEnd = true;
                    break;
                }

                word += msg.charAt(i);
            }

            // 마지막 문자이면서 이미 사전에 등록된 단어라면 아래와 같이 처리
            if (isEnd) {
                indexSet.add(dictionary.get(word));
                break;
            }

            indexSet.add(dictionary.get(word.substring(0, word.length() - 1)));
            dictionary.put(word, dictionaryIndex);

            dictionaryIndex += 1;
            i -= 1;
        }

        int[] answer = new int[indexSet.size()];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = indexSet.get(i);
        }

        return answer;
    }

    public void initDictionary(HashMap<String, Integer> dictionary) {
        char firstCharacter = 'A';
        for (int i = 1; i <= 26; i += 1) {
            dictionary.put(firstCharacter + "", i);
            firstCharacter += 1;
        }
    }
}
