import solution from './solution';

test('solution', () => {
  expect(solution([1, 2, 3, 4, 6, 7, 8, 0])).toBe(14);
  expect(solution([5, 8, 4, 0, 6, 7, 9])).toBe(6);
});
