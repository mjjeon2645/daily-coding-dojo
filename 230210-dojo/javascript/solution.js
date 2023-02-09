// 코드 1. 시간초과 6개

export default function solution(weights) {
  let answer = 0;
  const sortedArray = weights.sort((a, b) => a - b);

  for (let i = 0; i < sortedArray.length; i += 1) {
    const current = sortedArray[i];
    const next = sortedArray[i + 1];

    if (!next) {
      break;
    }

    for (let j = i + 1; j < sortedArray.length; j += 1) {
      if (current * 2 === sortedArray[j] * 2) {
        answer += 1;
        continue;
      }

      if (current * 2 === sortedArray[j] * 3) {
        answer += 1;
        continue;
      }

      if (current * 2 === sortedArray[j] * 4) {
        answer += 1;
        continue;
      }

      if (current * 3 === sortedArray[j] * 2) {
        answer += 1;
        continue;
      }

      if (current * 3 === sortedArray[j] * 3) {
        answer += 1;
        continue;
      }

      if (current * 3 === sortedArray[j] * 4) {
        answer += 1;
        continue;
      }

      if (current * 4 === sortedArray[j] * 2) {
        answer += 1;
        continue;
      }

      if (current * 4 === sortedArray[j] * 3) {
        answer += 1;
        continue;
      }

      if (current * 4 === sortedArray[j] * 4) {
        answer += 1;
      }
    }
  }

  return answer;
}
