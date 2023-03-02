// function calculateSum(array) {
//   return array.reduce((acc, cur) => acc + cur, 0);
// }

// export default function solution(elements) {
//   const set = new Set();

//   // 원소 갯수를 i
//   for (let i = 1; i <= elements.length; i += 1) {
//     for (let j = 0; j < elements.length; j += 1) {
//       if (j + i <= elements.length) {
//         set.add(calculateSum(elements.slice(j, j + i)));
//         continue;
//       }

//       set.add(calculateSum(elements.slice(j))
//       + calculateSum(elements.slice(0, j + i - elements.length)));
//     }
//   }

//   return set.size;
// }

export default function solution(elements) {
  const set = new Set();

  const subArrayLength = elements.length;

  for (let i = 1; i <= subArrayLength; i += 1) {
    // 슬라이딩 윈도우
    let sum = 0;

    for (let j = 0; j < subArrayLength; j += 1) {
      if (j === 0) {
        sum = elements.slice(0, i).reduce((acc, cur) => acc + cur, 0);
      }

      if (j !== 0) {
        sum -= elements[j - 1];
        sum += elements[(j + i - 1) % subArrayLength];
      }

      set.add(sum);
    }
  }

  return set.size;
}
