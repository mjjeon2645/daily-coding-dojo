import solution, { solution2, solution3 } from './solution';

test('solution', () => {
  expect(solution([70, 50, 80, 50], 100)).toBe(3);
  expect(solution([70, 80, 50], 100)).toBe(3);
});

test('solution2', () => {
  expect(solution2([70, 50, 80, 50], 100)).toBe(3);
  expect(solution2([70, 80, 50], 100)).toBe(3);
});

test('solution3', () => {
  expect(solution3([70, 50, 80, 50], 100)).toBe(3);
  expect(solution3([70, 80, 50], 100)).toBe(3);
});
