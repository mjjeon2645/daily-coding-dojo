function solution(data, col, row_begin, row_end) {
  // 정답 변수
  let result = 0;
  // col번째 컬럼의 값을 기준으로 오름차순 정렬
  const sortData = data.sort((a, b) => {
    if (a[col - 1] > b[col - 1]) return 1;
    // 동일하면 첫 번째 컬럼 기준 내림차순 정렬
    if (a[col - 1] === b[col - 1]) return b[0] - a[0];
    return -1;
  });
  // i 번째 행의 튜플에 대해 각 컬럼의 값을 i 로 나눈 나머지들의 합으로 정의
  for (let i = row_begin; i <= row_end; i++) {
    // 결괏값을 정답 변수에 XOR
    result ^= sortData[i - 1].map((a) => a % i).reduce((acc, cur, idx) => acc + cur, 0);
  }
  return result;
}

// export function customizedSort(data, column) {
//   return data.sort((a, b) => {
//     if (a[column - 1] === b[column - 1]) {
//       return b[0] - a[0];
//     }

//     if (a[column - 1] > b[column - 1]) {
//       return 1;
//     }

//     return -1;
//   });
// }

// export function sumOfMod(array, row) {
//   return array.reduce((pre, cur) => pre + (cur % row), 0);
// }

// export default function solution(data, col, row_begin, row_end) {
//   let answer = 0;

//   const sortedData = customizedSort(data, col);

//   for (let i = row_begin; i <= row_end; i += 1) {
//     const result = sortedData[i - 1].map((value) => value % i).reduce((pre, cur) => pre + cur, 0);
//     if (answer === 0 && result !== 0) {
//       answer = result;
//       continue;
//     }

//     if (answer !== 0 && result === 0) {
//       answer = result;
//       continue;
//     }

//     answer = 0;
//   }

//   return answer;
// }
