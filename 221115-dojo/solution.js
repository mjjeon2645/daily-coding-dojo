export function process(array) {
  let n = 1;
  let flag = false;

  const sortedArray = array.sort((a, b) => b - a);
  while (!flag) {
    n += 1;

    for (let i = 1; i < sortedArray.length; i += 1) {
      if ((sortedArray[0] * n) % sortedArray[i] === 0) {
        flag = true;
      }

      if ((sortedArray[0] * n) % sortedArray[i] !== 0) {
        flag = false;
        break;
      }
    }
  }

  return sortedArray[0] * n;
}

export default function solution(array) {
  if (array.length === 1) {
    return array[0];
  }

  return process(array);
}

// 과거 참고 풀이
// function findGcd(a, b) {
//     if (b === 0) {
//       return a;
//     }
//     // 이거 왜 안될까... 어 된다.
//     return a % b ? findGcd(b, a % b) : b;
//   }

//   function solution(array) {
//     if (array.length === 1) {
//       return array[0];
//     }

//     return array.reduce((a, b) => (a * b) / findGcd(a, b));
//   }
