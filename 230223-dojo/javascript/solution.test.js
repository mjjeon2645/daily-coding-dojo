const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([4, 3, 1, 2, 5])).toBe(2);
  expect(solution([5, 4, 3, 2, 1])).toBe(5);
});
