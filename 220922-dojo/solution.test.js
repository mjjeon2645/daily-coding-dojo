// 단계별로 풀기.

// 1. 입력받은 어레이의 길이가 1일 경우에? 해당 어레이의 인덱스 0원소를 반환해준다.
// 2. 입력받은 어레이의 길이가 2일 경우에? 해당 두 원소의 최소공배수를 구해준다.
// => 최소공배수 구하는 법? => 두 원소를 곱하고 최대공약수로 나누기
// => 두가지가 필요할 듯. 최소공배수를 구하는 식, 최대공약수를 구하는 식
// => 최대공약수는 어떻게 구하나? 유클리드 호제법
// 이런 부분이 재귀라고 하는 것
// a % b = c;
//  a = b, b = c

//  a % b = c;
//  a = b, b = c

//  ...
// 근데 유클리드호제 조건 자체가 a > b임.
import solution, { findGcd } from './solution';

test('length of array is 1', () => {
  expect(solution([2])).toBe(2);
  expect(solution([5])).toBe(5);
});

test('find GCD', () => {
  expect(findGcd(5, 2)).toBe(1);
  expect(findGcd(2, 5)).toBe(1);
  expect(findGcd(10, 30)).toBe(10);
});

test('length of array is 2', () => {
  expect(solution([2, 5])).toBe(10);
  expect(solution([5, 2])).toBe(10);
  expect(solution([10, 30])).toBe(30);
});

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
});
