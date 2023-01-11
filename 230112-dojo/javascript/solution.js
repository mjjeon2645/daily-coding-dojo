export default function solution(sizes) {
  const max = sizes.map((value) => Math.max(value[0], value[1]));
  const min = sizes.map((value) => Math.min(value[0], value[1]));

  const width = max.sort((a, b) => b - a)[0];
  const height = min.sort((a, b) => b - a)[0];

  return width * height;
}
