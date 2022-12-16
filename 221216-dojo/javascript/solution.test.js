const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(121)).toBe(144);
  expect(solution(3)).toBe(-1);
});
