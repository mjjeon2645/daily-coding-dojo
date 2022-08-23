/* eslint-disable no-console */
// eslint-disable-next-line import/prefer-default-export
export function solution(array, commands) {
  const answer = [];

  for (let i = 0; i < commands.length; i += 1) {
    const slicedArray = array.slice(commands[i][0] - 1, commands[i][1]);

    const sortedArray = slicedArray.sort((a, b) => a - b);

    answer.push(sortedArray[commands[i][2] - 1]);
  }

  return answer;
}
