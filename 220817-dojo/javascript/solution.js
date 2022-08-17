/* eslint-disable no-console */
function solution(n) {
  let answer = 0;

  const stringNumber = `${n}`;

  const numberArray = [stringNumber.length];
  console.log(numberArray);

  for (let i = 0; i < stringNumber.length; i += 1) {
    numberArray[i] = stringNumber.charAt(i);
  }

  const finalNumber = numberArray.sort((a, b) => a - b);

  answer = finalNumber.join('');

  return answer;
}

const n = 123;

solution(n);
