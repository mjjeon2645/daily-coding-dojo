export default function solution(order) {
  let answer = 0;
  const subBelt = [];
  let index = 0;

  for (let i = 1; i <= order.length; i += 1) {
    if (order[index] !== i) {
      subBelt.push(i);
    }

    if (order[index] === i) {
      index += 1;
      answer += 1;
    }

    while (subBelt.length !== 0 && subBelt.at(-1) === order[index]) {
      subBelt.pop();
      index += 1;
      answer += 1;
    }
  }

  return answer;
}
