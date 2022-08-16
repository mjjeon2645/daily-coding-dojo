/* eslint-disable no-console */
/* eslint-disable import/prefer-default-export */
export function solution(n) {
  let answer = 0;

  for (let i = 0; n > 0; i += 1) {
    let addNumber = 0;

    addNumber = n % 10;

    answer += addNumber;

    n = (n - addNumber) / 10;
  }

  // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
  console.log(answer);

  return answer;
}
