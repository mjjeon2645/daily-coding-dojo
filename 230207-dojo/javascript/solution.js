// 시간 초과 코드(마지막 4개 테스트 통과 못함)

// export default function solution(numbers) {
//   const answer = [];

//   for (let i = 0; i < numbers.length; i += 1) {
//     const standard = numbers[i];
//     let isBiggerNumberExist = false;
//     let j = i + 1;

//     while (j < numbers.length) {
//       if (standard < numbers[j]) {
//         answer.push(numbers[j]);
//         isBiggerNumberExist = true;
//         break;
//       }

//       j += 1;
//     }

//     if (isBiggerNumberExist === false) {
//       answer.push(-1);
//     }
//   }

//   return answer;
// }
