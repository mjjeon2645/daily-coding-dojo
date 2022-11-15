const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([2, 6, 8, 14])).toBe(168);
  expect(solution([2])).toBe(2);
  expect(solution([3])).toBe(3);
});
