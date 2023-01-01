// eslint-disable-next-line import/prefer-default-export
export function solution(n) {
  const answer = Number(n.toString().split('').sort((a, b) => b - a).join(''));

  return answer;
}
