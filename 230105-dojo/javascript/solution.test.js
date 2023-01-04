const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(5, [2, 4], [1, 3, 5])).toBe(5);
  expect(solution(5, [2, 4], [3])).toBe(4);
  expect(solution(3, [2, 4], [5, 3])).toBe(3);
  expect(solution(3, [2, 4], [5])).toBe(2);
  expect(solution(3, [2, 4], [1])).toBe(2);
  expect(solution(3, [3], [1])).toBe(2);
  expect(solution(2, [2], [1, 3])).toBe(2);
  expect(solution(5, [4, 2], [3, 5])).toBe(5);
  expect(solution(5, [1, 2, 3, 4, 5], [1, 2, 3, 4, 5])).toBe(5);
  expect(solution(5, [2, 4], [1, 3])).toBe(5);
});
