export default function solution(d, budget) {
  const sumArray = d.sort((a, b) => a - b).map((_, index) => d.slice(0, index + 1)
    .reduce((pre, cur) => pre + cur, 0));

  return sumArray.filter((value) => value <= budget).length;
}
