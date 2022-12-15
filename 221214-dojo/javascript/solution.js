export default function solution(x) {
  const total = x.toString().split('')
    .map((a) => Number(a))
    .reduce((accumulator, current) => accumulator + current, 0);

  return x % total === 0;
}
