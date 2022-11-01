export default function solution(brown, yellow) {
  const answer = [];

  const area = brown + yellow;

  for (let i = 3; i <= area; i += 1) {
    const width = i;
    const height = area / width;

    if (height > width) {
      continue;
    }

    if ((width - 2) * (height - 2) === yellow) {
      return [width, height];
    }
  }

  return answer;
}
