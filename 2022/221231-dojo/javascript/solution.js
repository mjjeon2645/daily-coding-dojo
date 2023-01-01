export default function solution(s, n) {
  const upperCaseArray = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('');
  const lowerCaseArray = upperCaseArray.map((value) => value.toLowerCase());

  const words = s.split('');

  return words.map((value) => {
    if (upperCaseArray.find((element) => element === value)) {
      const index = upperCaseArray.findIndex((item) => item === value);

      if (index + n <= 25) {
        return upperCaseArray[index + n];
      }

      return upperCaseArray[index + n - 26];
    }

    if (lowerCaseArray.find((element) => element === value)) {
      const index = lowerCaseArray.findIndex((item) => item === value);

      if (index + n <= 25) {
        return lowerCaseArray[index + n];
      }

      return lowerCaseArray[index + n - 26];
    }

    return ' ';
  }).reduce((pre, cur) => pre + cur, '');
}
