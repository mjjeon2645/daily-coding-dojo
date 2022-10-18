export function makeArray(original) {
  return original.split(' ');
}

export function getMinNumber(array) {
  return array.map((stringNumber) => Number(stringNumber)).sort((a, b) => a - b)[0];
}

export function getMaxNumber(array) {
  return array.map((stringNumber) => Number(stringNumber)).sort((a, b) => b - a)[0];
}

export default function solution(s) {
  const array = makeArray(s);

  const minNumber = getMinNumber(array);

  const maxNumber = getMaxNumber(array);

  return `${minNumber} ${maxNumber}`;
}
