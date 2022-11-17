export function process(a, b, round) {
  round.push(1);
  const boundaryOfA = a % 2 === 0 ? Math.floor(a / 2) : Math.floor(a / 2) + 1;
  const boundaryOfB = b % 2 === 0 ? Math.floor(b / 2) : Math.floor(b / 2) + 1;

  if (boundaryOfA === boundaryOfB) {
    return round;
  }

  return process(boundaryOfA, boundaryOfB, round);
}

export default function solution(n, a, b) {
  const round = [];

  const totalRound = process(a, b, round);

  return totalRound.length;
}
