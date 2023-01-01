/* eslint-disable import/prefer-default-export */
export function solution(n, lost, reserve) {
  let answer = 0;

  const sortedLost = [...lost].sort();
  const sortedReserve = [...reserve].sort();

  answer = n - sortedLost.length;

  for (let i = 0; i < sortedLost.length; i += 1) {
    for (let j = 0; j < sortedReserve.length; j += 1) {
      if (sortedLost[i] === sortedReserve[j]) {
        answer += 1;
        sortedLost[i] = -1;
        sortedReserve[j] = -1;
        break;
      }
    }
  }

  for (let i = 0; i < sortedLost.length; i += 1) {
    for (let j = 0; j < sortedReserve.length; j += 1) {
      if (sortedLost[i] - 1 === sortedReserve[j]
        || sortedLost[i] + 1 === sortedReserve[j]) {
        answer += 1;
        sortedLost[i] = -1;
        sortedReserve[j] = -1;
        break;
      }
    }
  }

  return answer;
}
