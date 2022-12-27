import solution, { getGcd, getLcm } from './solution';

test('solution', () => {
  expect(solution(3, 12)).toStrictEqual([3, 12]);
  expect(solution(2, 5)).toStrictEqual([1, 10]);
});

test('getGcd', () => {
  expect(getGcd(3, 12, 3)).toBe(3);
  expect(getGcd(2, 5, 2)).toBe(1);
  expect(getGcd(8, 36, 8)).toBe(4);
});

test('getLcm', () => {
  expect(getLcm(3, 12, 3)).toBe(12);
});
