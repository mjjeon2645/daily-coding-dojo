export default function solution(arr1, arr2) {
  const answer = Array.from(Array(arr1.length), () => Array(arr2[0].length).fill(0));

  for (let i = 0; i < arr1.length; i += 1) {
    for (let j = 0; j < arr2[0].length; j += 1) {
      answer[i][j] = arr1[i].map((item, index) => item * arr2[index][j])
        .reduce((a, b) => a + b, 0);
    }
  }

  return answer;
}
