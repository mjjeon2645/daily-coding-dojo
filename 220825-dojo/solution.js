/* eslint-disable import/prefer-default-export */
export function solution(answers) {
  const answer = [];

  const supo1 = [1, 2, 3, 4, 5];
  const supo2 = [2, 1, 2, 3, 2, 4, 2, 5];
  const supo3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  let supo1AnswerCount = 0;
  let supo2AnswerCount = 0;
  let supo3AnswerCount = 0;

  for (let i = 0; i < answers.length; i += 1) {
    if (answers[i] === supo1[i % 5]) {
      supo1AnswerCount += 1;
    }

    if (answers[i] === supo2[i % 8]) {
      supo2AnswerCount += 1;
    }

    if (answers[i] === supo3[i % 10]) {
      supo3AnswerCount += 1;
    }
  }

  const answerCountTable = [supo1AnswerCount, supo2AnswerCount, supo3AnswerCount];

  const maxCount = [...answerCountTable].sort((a, b) => a - b)[2];

  if (maxCount === answerCountTable[0]) {
    answer.push(1);
  }

  if (maxCount === answerCountTable[1]) {
    answer.push(2);
  }

  if (maxCount === answerCountTable[2]) {
    answer.push(3);
  }

  return answer;
}
