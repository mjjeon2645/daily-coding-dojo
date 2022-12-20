export default function solution(d, budget) {
  const sortedArray = [...d].sort((a, b) => a - b);

  if (sortedArray[0] > budget) {
    return 0;
  }

  sortedArray
    .reduce(
      (acc, cur, index) => {
        if (acc + cur > budget) {
          sortedArray.splice(index);
          return acc + cur;
        }

        if (acc + cur === budget) {
          sortedArray.splice(index + 1);
          return acc + cur;
        }

        return acc + cur;
      }
      , 0,
    );

  return sortedArray.length;
}
