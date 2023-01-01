export default function solution(numbers) {
  return 45 - numbers.reduce((pre, cur) => pre + cur, 0);
}
