// js는 어떻게 작업단위를 쪼개야할까? 너무 겁먹지 말고 자바처럼 똑같이 작업단위를 쪼개도록 하자
// 우선 자바에서와 마찬가지로 s가 단순히 1자리 숫자일때를 가정해보자.
// 바꿔보는 것도 성공하고 테스트 만드는 것도 해봄.
// 이번에 새로 replace()라는 함수를 알게 되었으니 이를 활용해보자.
// 모든 문자열을 바꾸고 싶을 때
// replace(/oldstring/g, newstring) 해보면 됨

export function converterToNumber(mixedNumber) {
  const convertedFromStringNumber = mixedNumber
    .replace(/one/g, '1')
    .replace(/two/g, '2')
    .replace(/three/g, '3')
    .replace(/four/g, '4')
    .replace(/five/g, '5')
    .replace(/six/g, '6')
    .replace(/seven/g, '7')
    .replace(/eight/g, '8')
    .replace(/nine/g, '9')
    .replace(/zero/g, '0');
  return convertedFromStringNumber;
}

export function toIntegerNumber(stringNumber) {
  const rightNumber = Number(stringNumber);

  return rightNumber;
}

export function solution(s) {
  const stringNumber = converterToNumber(s);

  const answer = toIntegerNumber(stringNumber);

  return answer;
}
