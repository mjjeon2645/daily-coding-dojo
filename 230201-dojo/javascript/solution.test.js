const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(['X591X', 'X1X5X', 'X231X', '1XXX1'])).toStrictEqual([1, 1, 27]);
  expect(solution(['XXX', 'XXX', 'XXX'])).toStrictEqual([-1]);
});
