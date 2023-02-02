import solution from './solution';

test('solution', () => {
  expect(solution(1041)).toBe(5);
  expect(solution(9)).toBe(2);
  expect(solution(20)).toBe(1);
  expect(solution(529)).toBe(4);
  expect(solution(15)).toBe(0);
  expect(solution(32)).toBe(0);
});
