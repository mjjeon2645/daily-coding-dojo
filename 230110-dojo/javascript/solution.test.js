const { default: solution, makeArray } = require('./solution');

test('solution', () => {
  expect(solution(13, 17)).toBe(43);
});

test('makeArray', () => {
  expect(makeArray(1, 3)).toStrictEqual([1, 2, 3]);
});
