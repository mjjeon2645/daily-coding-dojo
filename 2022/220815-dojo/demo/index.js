function solution(n) {
  const tempNumber = `${n}`;
  const answer = new Array(tempNumber.length);

  for (let i = 0; i < tempNumber.length; i += 1) {
    answer[i] = parseInt(tempNumber.charAt(i));
  }

  return answer.reverse();
}
