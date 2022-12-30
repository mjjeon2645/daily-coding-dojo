export default function solution(n) {
  const reversedNumberArray = n.toString(3).split('').reverse();
  return reversedNumberArray
    .map((value, index) => value * (3 ** (reversedNumberArray.length - 1 - index)))
    .reduce((pre, cur) => pre + cur, 0);
}
