export function removeZero(string) {
  if (string.includes('0') === false) {
    return string;
  }
  const stringWithoutZero = [...string].filter((value) => value === '1').join('');

  return stringWithoutZero;
}

export function countingRemovalOfZero(string, countOfRemovingZero) {
  const countOfZero = [...string].filter((value) => value === '0').length;

  return countOfRemovingZero.concat([countOfZero]);
}

export function process(countOfConverting, countOfRemovingZero, string) {
  const stringWithoutZero = removeZero(string);

  const totalCountOfConverting = countOfConverting.concat([1]);

  const totalCountOfRemovingZero = countingRemovalOfZero(string, countOfRemovingZero);

  const binaryString = stringWithoutZero.length.toString(2);

  if (binaryString === '1') {
    const sumCountOfConverting = totalCountOfConverting.reduce((acc, cur) => acc + cur, 0);
    const sumCountOfRemovingZero = totalCountOfRemovingZero.reduce((acc, cur) => acc + cur, 0);
    return [sumCountOfConverting, sumCountOfRemovingZero];
  }

  return process(totalCountOfConverting, totalCountOfRemovingZero, binaryString);
}

export default function solution(string) {
  const countOfConverting = [0];

  const countOfRemovingZero = [0];

  return process(countOfConverting, countOfRemovingZero, string);
}
