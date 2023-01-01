export function makeArray(number) {
  return number.toString().split('');
}

export default function solution(x) {
  const createdArray = makeArray(x);

  const total = createdArray
    .map((a) => Number(a))
    .reduce((accumulator, current) => accumulator + current, 0);

  return x % total === 0;
}
