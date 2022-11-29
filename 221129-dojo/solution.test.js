const { default: solution, findLength } = require('./solution');

test('solution', () => {
  expect(solution([[1, 4], [3, 2], [4, 1]], [[3, 3], [3, 3]]))
    .toStrictEqual([[15, 15], [15, 15], [15, 15]]);
  expect(solution([[2, 3, 2], [4, 2, 4], [3, 1, 4]], [[5, 4, 3], [2, 4, 1], [3, 1, 1]]))
    .toStrictEqual([[22, 22, 11], [36, 28, 18], [29, 20, 14]]);
});

test('findLength', () => {
  // expect(findLength([[1, 4], [3, 2], [4, 1]])).toBe(3);
  // expect(findLength([[1, 4], [3, 2]])).toBe(2);
  // expect(findLength([[1, 4], [3, 2], [4, 1], [4, 1], [4, 1]])).toBe(5);
});
