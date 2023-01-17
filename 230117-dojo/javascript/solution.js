export default function solution(arr) {
  const answer = [];

  arr.forEach((value) => {
    if (answer.length === 0) {
      answer.push(value);
    }

    if (answer[answer.length - 1] !== value) {
      answer.push(value);
    }
  });

  return answer;
}

// export default function solution(arr) {
//     return arr.filter((value, index) => value !== arr[index + 1]);
//   }
