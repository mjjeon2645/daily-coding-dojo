export default function solution(s) {
  const bracket = { '(': ')', '[': ']', '{': '}' };
  const bracketLeft = Object.keys(bracket);

  return s.split('').reduce((ac, v, i) => {
    const curStr = s.slice(i) + s.slice(0, i);
    const stack = [];
    for (const curChar of curStr) {
      if (bracketLeft.includes(curChar)) stack.push(curChar);
      else if (bracket[stack.pop()] !== curChar) return ac;
    }

    return stack.length === 0 ? ac += 1 : ac;
  }, 0);
}
