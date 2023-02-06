// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

export function validator(number) {
  const array = number.split('11');
  return array[1] === undefined;
}

export default function solution(N) {
  // Implement your solution here
  for (let i = 0; i < N / 2 + 1; i += 1) {
    const binaryNumber1 = i.toString(2);
    const binaryNumber2 = (N - i).toString(2);

    const isSparseOf1 = validator(binaryNumber1);

    if (isSparseOf1) {
      const isSparseOf2 = validator(binaryNumber2);
      if (isSparseOf2) {
        return i;
      }
    }
  }

  return -1;
}
