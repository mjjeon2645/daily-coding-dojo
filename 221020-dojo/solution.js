export function toSmall(string) {
  return string.toLowerCase();
}

export function toArray(string) {
  return string.split(' ', -1);
}

export function makeResult(array) {
  return array.map((value) => value.charAt(0).toUpperCase() + value.slice(1, value.length)).join(' ');
}

export default function solution(s) {
  const smallString = toSmall(s);
  const arrayOfString = toArray(smallString);
  return makeResult(arrayOfString);
}
