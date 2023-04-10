export default function solution(n, m, section) {
  let answer = 0;
  let max = 0;

  section.forEach((wallNumber) => {
    if (wallNumber > max) {
      answer += 1;
      max = wallNumber + m - 1;
    }
  });

  return answer;
}
