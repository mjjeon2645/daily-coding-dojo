export default function solution(s) {
  return s.split('').sort().reverse().join('');
}

// export default function solution(s) {
//   const array = s.split('').sort((a, b) => {
//     if (a < b) {
//       return 1;
//     }

//     if (a > b) {
//       return -1;
//     }

//     return 0;
//   });

//   return array.join('');
// }
