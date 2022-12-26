export default function solution(absolutes, signs) {
  const numbers = absolutes.map((value, index) => {
    if (signs[index]) {
      return value;
    }

    return (-1) * value;
  });

  return numbers.reduce((pre, cur) => pre + cur, 0);
}
