export default function solution(n) {
  const answer = -1;

  if (n === 1) {
    return 4;
  }

  for (let i = 2; i < n; i += 1) {
    if (i * i === n) {
      return (i + 1) * (i + 1);
    }
  }

  return answer;
}
