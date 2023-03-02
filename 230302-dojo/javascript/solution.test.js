const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([7, 9, 1, 1, 4])).toBe(18);
});
