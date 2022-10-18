export default function solution3(s) {
  const array = s.split(' ');

  return `${[...array].sort((a, b) => a - b)[0]} ${[...array].sort((a, b) => a - b)[array.length - 1]}`;
}
