export default function solution(s) {
  const stack = [];
  const array = s.split('');

  for (let i = 0; i < array.length; i += 1) {
    // stack의 length가 0이면 집어넣기
    if (!stack.length) {
      stack.push(array[i]);
      continue;
    }

    // stack의 length가 0이 아닐 때 가장 마지막 요소가 arrya[i]와 동일하면 stack에서 빼기
    if (stack && stack[stack.length - 1] === array[i]) {
      stack.pop();
      continue;
    }

    if (stack && stack[stack.length - 1] !== array[i]) {
      stack.push(array[i]);
  }

  return stack.length === 0 ? 1 : 0;
}
