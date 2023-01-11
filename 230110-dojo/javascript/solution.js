export function makeArray(left, right) {
  return Array(right - left + 1).fill(0).map((_, index) => left + index);
}

export default function solution(left, right) {
  const array = makeArray(left, right);

  const resultArray = array.map((value) => {
    let count = 0;

    for (let i = 1; i <= value; i += 1) {
      count += value % i === 0 ? 1 : 0;
    }

    return count % 2 === 0 ? value : value * (-1);
  });

  return resultArray.reduce((pre, cur) => pre + cur, 0);
}
