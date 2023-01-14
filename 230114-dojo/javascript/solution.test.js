const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([3, 1, 2, 3])).toBe(2);
  expect(solution([3, 3, 3, 2, 2, 4])).toBe(3);
  expect(solution([3, 3, 3, 2, 2, 2])).toBe(2);
});
