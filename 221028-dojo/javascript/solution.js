export function countOne(number) {
  return number.toString(2).split('').filter((value) => value === '1').length;
}

export function countOneOfLargerNumber(standard, largerNumber) {
  const count = countOne(largerNumber);

  if (standard === count) {
    return largerNumber;
  }

  return countOneOfLargerNumber(standard, largerNumber + 1);
}

export default function solution(n) {
  const standard = countOne(n);

  return countOneOfLargerNumber(standard, n + 1);
}
