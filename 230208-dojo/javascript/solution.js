// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

export default function solution(A, K) {
  // Implement your solution here

  // 1. 가드클로즈. 배열이 하나의 원소로 이루어진 경우
  const set = new Set(A);

  if (set.size === 1) {
    return A;
  }

  // 2. 가즈클로즈. 로테이트 횟수와 배열 길이가 같은 경우
  if (K === A.length) {
    return A;
  }

  // 3. 진짜 로테이트 횟수 구하기
  //   const rotateNumber = K % A.length;

  //   const answer = A.map((_, index) => {
  //     const newIndex = rotateNumber + index;
  //     console.log(newIndex);

  //     if (newIndex < A.length) {
  //       return A[newIndex];
  //     }

  //     return A[newIndex - A.length];
  //   });

  //   console.log(answer);

  const indexOfFirstItem = A.length - (K % A.length);

  const front = A.slice(indexOfFirstItem);
  const result = front.concat(A.slice(0, indexOfFirstItem));

  return result;
}
