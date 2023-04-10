const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(8, 4, [2, 3, 6])).toBe(2);
  expect(solution(5, 3, [1, 3])).toBe(1);
  expect(solution(4, 1, [1, 2, 3, 4])).toBe(4);
});
