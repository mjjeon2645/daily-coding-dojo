import solution from './solution';

test('solution', () => {
  expect(solution([1, 3, 2, 5, 4], 9)).toBe(3);
  expect(solution([2, 2, 3, 3], 10)).toBe(4);
  expect(solution([1], 1)).toBe(1);
  expect(solution([3, 1, 1], 3)).toBe(2);
  expect(solution([4], 3)).toBe(0);
});
