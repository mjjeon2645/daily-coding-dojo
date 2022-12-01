export default function solution(s) {
  const answer = [];
  const tuples = s.slice(2, -2).split(/},{/g).sort((a, b) => a.length - b.length);

  tuples.forEach((item) => {
    const tuple = item.split(',');
    answer.push(tuple.find((e) => !answer.includes(e)));
  });

  return answer.map((e) => Number(e));
}
