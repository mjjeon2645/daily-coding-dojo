export default function solution(clothes) {
  let answer = 1;

  // 각의상의 갯수를 확인 할 object
  const obj = {};

  clothes.map((clothe) => {
    // obj에 clothe[1]종류의 의상이 있으면 + 1을 해줍니다.
    if (obj[clothe[1]]) {
      return obj[clothe[1]] += 1;
    }
    // obj에 clothe[1]종류의 의상이 없으면
    return obj[clothe[1]] = 1;
  });

  const keys = Object.keys(obj);
  keys.forEach((key) => {
    // +1 를 해주는 이유는 해당 종류의 의상을 입지 않을 수 있기때문에 +1를 해줍니다.
    answer *= obj[key] + 1;
  });
  // 모든 경우의 수를 구한다음 의상을 하나도 입지 않은 경우의 수를 빼주면 답이 나옵니다.
  return answer - 1;
}
