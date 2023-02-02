// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

export default function solution(N) {
  // Implement your solution here
  const binaryNumber = N.toString(2);

  if (!binaryNumber.includes('0')) {
    return 0;
  }

  const listsOfIndexOfOne = binaryNumber.split('').reduce((array, value, index) => {
    if (value === '1') {
      array.push(index);
    }

    return array;
  }, []);

  if (listsOfIndexOfOne.length < 2) {
    return 0;
  }

  let answer = 0;

  for (let i = 1; i <= listsOfIndexOfOne.length; i += 1) {
    const countsOfZero = listsOfIndexOfOne[i] - listsOfIndexOfOne[i - 1] - 1;

    if (answer < countsOfZero) {
      answer = countsOfZero;
    }
  }

  return answer;
}
