const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution('Zbcdefg')).toBe('gfedcbZ');
});
