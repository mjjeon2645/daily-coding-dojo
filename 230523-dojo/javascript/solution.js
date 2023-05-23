// export default function solution(targets) {
//   let answer = 0;

//   const sortedTargets = [...targets].sort((a, b) => a[0] - b[0]);

//   while (true) {
//     const standard = sortedTargets.shift();

//     if (!sortedTargets.length) {
//       answer += 1;
//       return;
//     }

//     const nextS = sortedTargets[0][0];

//     if (nextS < standard[1]) {
//       answer += 1;
//       continue;
//     }

//     const index = sortedTargets.findIndex((target) => target[0] >= standard[1]);

//     for (let i = 0; i < index; i += 1) {
//       sortedTargets.shift();
//     }

//     answer += 1;
//   }

//   return answer;
// }

// export default function solution(targets) {
//   let answer = 1;

//   const sortedTargets = [...targets].sort((a, b) => b[0] - a[0]);

//   let [s, e] = sortedTargets.shift();

//   for (const target of sortedTargets) {
//     const [targetS, targetE] = target;

//     if (targetE <= s) {
//       answer += 1;
//       s = targetS;
//     }
//   }

//   return answer;
// }

export default function solution(targets) {
  let answer = 0;
  let prev = -1;

  const sortedTargets = [...targets].sort((a, b) => a[1] - b[1]);

  for (let i = 0; i < sortedTargets.length; i += 1) {
    const [s, e] = sortedTargets[i];

    if (prev <= s) {
      prev = e;
      answer += 1;
    }
  }

  return answer;
}
