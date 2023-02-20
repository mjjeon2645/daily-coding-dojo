import solution from './solution';

test('solution', () => {
  expect(solution(6, [1, 3, 2, 5, 4, 5, 2, 3])).toBe(3);
  expect(solution(4, [1, 3, 2, 5, 4, 5, 2, 3])).toBe(2);
  expect(solution(2, [1, 1, 1, 1, 2, 2, 2, 3])).toBe(1);
  expect(solution(8, [1, 1, 1, 1, 2, 2, 2, 3])).toBe(3);
});
