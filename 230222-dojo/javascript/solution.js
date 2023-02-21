export function collatzArray(number) {
  const array = [];

  array.push(number);

  let inputNumber = number;

  while (true) {
    if (inputNumber % 2 === 0) {
      inputNumber /= 2;
      array.push(inputNumber);

      if (inputNumber === 1) {
        break;
      }
    }

    if (inputNumber % 2 !== 0) {
      inputNumber = inputNumber * 3 + 1;
      array.push(inputNumber);
    }
  }

  return array;
}

export function calculateArea(collatzNumbers) {
  const array = [];

  for (let i = 1; i < collatzNumbers.length; i += 1) {
    const area = (collatzNumbers[i - 1] + collatzNumbers[i]) / 2;
    array.push(area);
  }

  return array;
}

export function integral(number, areasArray, rangesArray) {
  const result = [];

  for (let i = 0; i < rangesArray.length; i += 1) {
    const picked = rangesArray[i];
    const start = picked[0];
    const end = areasArray.length + picked[1];

    if (end < start) {
      result.push(-1);
      continue;
    }

    if (end === start) {
      result.push(0);
      continue;
    }

    const slicedArray = areasArray.slice(start, end);

    result.push(slicedArray.reduce((pre, cur) => pre + cur, 0));
  }

  return result;
}

export default function solution(k, ranges) {
  const array = collatzArray(k);

  const areas = calculateArea(array);

  return integral(k, areas, ranges);
}
