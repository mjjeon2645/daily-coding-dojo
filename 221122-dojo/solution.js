export default function solution(number) {
  const numberArray = [0, 1, 2];

  for (let i = 3; i <= 2000; i += 1) {
    const convertedNumber = (numberArray[i - 1] + numberArray[i - 2]) % 1234567;
    numberArray.push(convertedNumber);
  }

  return numberArray[number];
}
