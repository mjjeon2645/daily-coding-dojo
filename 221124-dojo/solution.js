// 내가 풀려고 했던 해결방식. edge 케이스 1개가 통과되지 않음. 로직 추가 필요
// export default function solution(citations) {
//   const answer = 0;

//   if (citations.length === 1 && citations[0] === 0) {
//     return 0;
//   }

//   if (citations.length === 1 && citations[0] !== 0) {
//     return 1;
//   }
//   citations.sort();

//   let i = 0;

//   while (i < citations[citations.length - 1]) {
//     const newArray = citations.filter((citation) => citation >= i);

//     if (i === newArray.length) {
//       return i;
//     }

//     i += 1;
//   }
//   return answer;
// }
