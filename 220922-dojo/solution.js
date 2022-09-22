export function findGcd(a, b) {
  if (b === 0) {
    return a;
  }
  // 이거 왜 안될까... 어 된다.
  return a % b ? findGcd(b, a % b) : b;
}

export default function solution(array) {
  if (array.length === 1) {
    return array[0];
  }

  return array.reduce((a, b) => (a * b) / findGcd(a, b));
}
