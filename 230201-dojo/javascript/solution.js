// export default function solution(maps) {
//   let answer = [];
//   let count = 0;
//   const rowLength = maps.length;
//   const columnLength = maps[0].length;
//   // 상하좌우
//   const rowIncrement = [0, 0, -1, 1];
//   const columnIncrement = [1, -1, 0, 0];

//   let twoDimentionArray = [...maps].map((value) => value.split(''));

//   for (let i = 0; i < rowLength; i += 1) {
//     for (let j = 0; j < columnLength; j += 1) {
//         if (twoDimentionArray[i][j] === 'X') {
//             continue;
//         }

//         count += twoDimentionArray[i][j];
//         twoDimentionArray[i][j] = 'X';

//     }
//   }
//   return [];
// }
