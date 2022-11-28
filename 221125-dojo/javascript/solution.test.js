import solution from './solution';

test('solution', () => {
  expect(solution([1, 1, 1, 1, 1], 3)).toBe(5);
  expect(solution([4, 1, 2, 1], 4)).toBe(2);
});
