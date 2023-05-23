const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([[4, 5], [4, 8], [10, 14], [11, 13], [5, 12], [3, 7], [1, 4]]))
    .toBe(3);
});
