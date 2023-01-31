const { default: nonDivisibleSubset } = require('./nonDivisibleSubset');

test('nonDivisibleSubset', () => {
  expect(nonDivisibleSubset(3, [1, 7, 2, 4])).toBe(3);
  expect(nonDivisibleSubset(7, [
    278, 576, 496, 727,
    410, 124, 338, 149,
    209, 702, 282, 718,
    771, 575, 436,
  ])).toBe(11);
});
