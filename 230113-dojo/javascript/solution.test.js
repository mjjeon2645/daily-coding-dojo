const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([1, 3, 2, 5, 4], 9)).toBe(3);
  expect(solution([2, 2, 3, 3], 10)).toBe(4);
  expect(solution([1], 1)).toBe(1);
  expect(solution([1], 2)).toBe(1);
  expect(solution([2], 1)).toBe(0);
  expect(solution([4, 3, 2, 2], 11)).toBe(4);
  expect(solution([4, 3, 2, 2], 5)).toBe(2);
});
