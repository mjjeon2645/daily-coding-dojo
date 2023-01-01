export default function solution(num) {
  let number = num;

  for (let i = 0; i < 500; i += 1) {
    if (number === 1) {
      return i;
    }

    number = (number % 2 === 0) ? number / 2 : number * 3 + 1;
  }

  return -1;
}
