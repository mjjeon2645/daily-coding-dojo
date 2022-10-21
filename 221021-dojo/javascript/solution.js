export function toArray(string) {
  return string.split('');
}

export default function solution(s) {
  const array1 = toArray(s);

  const convertedArray = array1.map((value) => (value === '(' ? 1 : -1));

  if (convertedArray[0] === -1) {
    return false;
  }

  const sum = convertedArray.reduce((accumulate, current) => {
    if (accumulate < 0) {
      return -2;
    }
    return accumulate + current;
  }, 0);

  return sum === 0;
}
