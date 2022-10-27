export default function solution(n) {
  const answer = [];

  for (let i = 1; i <= n; i += 1) {
    if (n % i === 0 && i % 2 === 1) {
      answer.push(1);
    }
  }

  return answer.length;
}
