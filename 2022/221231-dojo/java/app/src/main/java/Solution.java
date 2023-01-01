class Solution {
    public String solution(String s, int n) {
        String accumulate = "";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String[] words = s.split("");

        for (int i = 0; i < words.length; i += 1) {
            if (!upperCase.contains(words[i]) && !lowerCase.contains(words[i])) {
                accumulate += " ";
                continue;
            }

            if (upperCase.contains(words[i])) {
                int index = upperCase.indexOf(words[i]);

                if (index + n > 25) {
                    accumulate += upperCase.charAt(index + n - 26);
                    continue;
                }

                if (index + n <= 25) {
                    accumulate += upperCase.charAt(index + n);
                }
            }

            if (!upperCase.contains(words[i])) {
                int index = lowerCase.indexOf(words[i]);

                if (index + n > 25) {
                    accumulate += lowerCase.charAt(index + n - 26);
                    continue;
                }

                if (index + n <= 25) {
                    accumulate += lowerCase.charAt(index + n);
                }
            }
        }

        return accumulate;
    }
}
