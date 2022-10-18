export default function solution2(s) {
  const array = s.split(' ');
  return `${Math.min(...array)} ${Math.max(...array)}`;
}
