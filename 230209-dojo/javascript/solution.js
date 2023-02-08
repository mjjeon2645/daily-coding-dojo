// function solution(A) {
//   const uniqueSetOfElement = new Set(A);
//   let answer = 0;

//   const keys = [...uniqueSetOfElement.keys()];

//   for (let i = 0; i < keys.length; i += 1) {
//     const filteredArray = A.filter((value) => value === keys[i]);
//     if (filteredArray.length % 2 !== 0) {
//       answer = keys[i];
//       break;
//     }
//   }
//   return answer;
// }

// function solution(A) {
//   // pop으로 해보자.

//   const sortedArray = A.sort((a, b) => a - b);
//   let answer = 0;
//   let count = 0;

//   while (true) {
//     const popedElement = sortedArray.shift();
//     count += 1;

//     if (sortedArray[0] !== popedElement) {
//       if (count % 2 === 0) {
//         count = 0;
//         continue;
//       }

//       if (count % 2 !== 0) {
//         answer = popedElement;
//         break;
//       }
//     }
//   }

//   return answer;
// }

function solution(A) {
  const total = A.reduce((count, num) => {
    count[num] = count[num] ? count[num] + 1 : 1;
    return count;
  }, {});

  for (key in total) {
    if (total[key] % 2 === 1) {
      return Number(key);
    }
  }

  return 0;
}
