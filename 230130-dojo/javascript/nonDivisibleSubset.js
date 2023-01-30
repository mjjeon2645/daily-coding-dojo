export default function nonDivisibleSubset(k, s) {
  const remain = s.map((value) => value % k);

  let answer = 0;

  if (k % 2 === 0) {
    answer = Math.min(1, remain[k / 2]);
  }

  answer += Math.min(1, remain[0]);

  for (let i = 1; i < (k + 1) / 2; i += 1) {
    if (i !== k - 1) {
      answer += Math.max(remain[i], remain[k - i]);
    }
  }

  return answer;
}
