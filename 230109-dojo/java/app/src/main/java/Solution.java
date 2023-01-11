import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        int accumulatorForFirst = 0;
        int accumulatorForSecond = 0;
        int accumulatorForThird = 0;

        accumulatorForFirst = calculateOfFirst(answers, accumulatorForFirst);
        accumulatorForSecond = calculateOfSecond(answers, accumulatorForSecond);
        accumulatorForThird = calculateOfThird(answers, accumulatorForThird);
        
        return answer;
    }

    public int calculateOfFirst(int[] answers, int accumulatorForFirst) {
        for (int i = 0; i < answers.length; i += 1) {
           if (answers[i] == i % 5 + 1) {
               accumulatorForFirst += 1;
           }
        }

        return accumulatorForFirst;
    }

    public int calculateOfSecond(int[] answers, int accumulatorForSecond) {
        for (int i = 0; i < answers.length; i += 2) {
            if (answers[i] == 2) {
                accumulatorForSecond += 1;
            }
        }

        for (int i = 1; i < answers.length; i += 2) {
            if (i % 8 == 1 && answers[i] == 1) {
                accumulatorForSecond += 1;
                continue;
            }

            if (i % 8 == 3 && answers[i] == 3) {
                accumulatorForSecond += 1;
                continue;
            }

            if (i % 8 == 5 && answers[i] == 4) {
                accumulatorForSecond += 1;
                continue;
            }

            if (i % 8 == 7 && answers[i] == 5) {
                accumulatorForSecond += 1;
            }
        }
        return accumulatorForSecond;
    }

    public int calculateOfThird(int[] answers, int accumulatorForThird) {
        for (int i = 0; i < answers.length; i += 1) {
            if ((i % 10 == 0 || i % 10 == 1) && answers[i] == 3) {
                accumulatorForThird += 1;
                continue;
            }

            if ((i % 10 == 2 || i % 10 == 3) && answers[i] == 1) {
                accumulatorForThird += 1;
                continue;
            }

            if ((i % 10 == 4 || i % 10 == 5) && answers[i] == 2) {
                accumulatorForThird += 1;
                continue;
            }

            if ((i % 10 == 6 || i % 10 == 7) && answers[i] == 4) {
                accumulatorForThird += 1;
                continue;
            }

            if ((i % 10 == 8 || i % 10 == 9) && answers[i] == 5) {
                accumulatorForThird += 1;
            }
        }

        return accumulatorForThird;
    }
}
