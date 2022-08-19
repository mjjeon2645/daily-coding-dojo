// eslint-disable-next-line import/prefer-default-export
export function solution(s) {
  const answer = s.split(' ')
    .map((word) => word.split('')
      .map((value, i) => (i % 2 === 0 ? value.toUpperCase() : value.toLowerCase()))
      .join(''))
    .join(' ');
  return answer;
}
