export function makeArray(string) {
  const result = [];

  for (let i = 0; i < string.length - 1; i += 1) {
    const element = string.substr(i, 2).toLowerCase();

    if (element.match(/[a-z]{2}/)) {
      result.push(element);
    }
  }
  return result;
}

export default function solution(str1, str2) {
  const arr1 = makeArray(str1);
  const arr2 = makeArray(str2);

  const set = new Set([...arr1, ...arr2]);

  let union = 0;
  let intersection = 0;

  set.forEach((element) => {
    const has1 = arr1.filter((value) => value === element).length;
    const has2 = arr2.filter((value) => value === element).length;

    union += Math.max(has1, has2);
    intersection += Math.min(has1, has2);
  });
  return union === 0 ? 65536 : Math.floor(intersection / union * 65536);
}
