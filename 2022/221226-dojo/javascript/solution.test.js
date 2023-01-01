import solution from './solution';

test('solution', () => {
  expect(solution([4, 7, 12], [true, false, true])).toBe(9);
  expect(solution([1, 2, 3], [false, false, true])).toBe(0);
});
