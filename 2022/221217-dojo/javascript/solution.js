export function makeArray(number) {
  return new Array(number).fill(0)
    .map((_, index) => number % index);
}

export function findIndex(array) {
  return array.map((value, index) => (value !== 1 ? 0 : index))
    .findIndex((value) => value !== 0);
}

export default function solution(n) {
  const newArray = makeArray(n);

  return findIndex(newArray);
}
