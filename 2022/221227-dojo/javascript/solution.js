export function makeArray(A) {
  return A.sort((a, b) => b - a)
    .map((value) => value.toString().charAt(0) + (value % 10).toString());
}

export function validatorToFindDuplicated(array) {
  const validator = new Set();

  array.forEach((value) => validator.add(value));
  if (validator.size === array.length) {
    return -1;
  }

  return 1;
}

export default function solution(A) {
  const array = makeArray(A);

  const result = validatorToFindDuplicated(array);

  if (result === -1) {
    return result;
  }

  const resultArray = [];

  for (let i = 0; i < array.length; i += 1) {
    for (let j = i + 1; j < array.length; j += 1) {
      if (array[i] === array[j]) {
        resultArray.push(A.sort((a, b) => b - a)[i] + A.sort((a, b) => b - a)[j]);
      }
    }
  }

  return resultArray.sort((a, b) => b - a)[0];
}
