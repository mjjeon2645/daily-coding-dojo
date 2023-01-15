export default function solution(arr, divisor) {
  const resultArray = arr.sort((a, b) => a - b).filter((value) => value % divisor === 0);

  return resultArray.length === 0 ? [-1] : resultArray;
}
