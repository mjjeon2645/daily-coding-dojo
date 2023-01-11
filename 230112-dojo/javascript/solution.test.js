const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([[60, 50], [30, 70], [60, 30], [80, 40]])).toBe(4000);
});
