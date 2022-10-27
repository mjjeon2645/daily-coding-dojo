export function makeArray(number) {
  return Array.from({ length: number }, (value, index) => index + 1);
}

export function accumulator(array, number) {
  if (array.length === 1) {
    return -2;
  }

  return array.reduce(
    (acc, cur) => {
      if (accumulator === number) {
        return 0;
      }

      if (accumulator > number) {
        return -1;
      }

      return acc + cur;
    }
    , 0,
  );
}

export function process(arrayFromNumber, number) {
  accumulator(arrayFromNumber, number);
}

export default function solution(n) {
  const answer = 4;

  const arrayFromNumber = makeArray(n);

  const count = [];

  const result = accumulator(arrayFromNumber, n);

  if (result === -1) {
    accumulator(arrayFromNumber.shift(), n);
  }

  if (result === 0) {
    count.push(1);
    accumulator(arrayFromNumber.shift(), n);
  }

  if (result === -2) {
    return count.length;
  }

  return answer;
}
