import solution, { customizedSort, sumOfMod } from './solution';

test('solution', () => {
  expect(solution([[2, 2, 6], [1, 5, 10], [4, 2, 9], [3, 8, 3]], 2, 2, 3)).toBe(4);
});

test('customizedSort', () => {
  expect(customizedSort([[2, 2, 6], [1, 5, 10], [4, 2, 9], [3, 8, 3]], 2))
    .toStrictEqual([[4, 2, 9], [2, 2, 6], [1, 5, 10], [3, 8, 3]]);
  expect(customizedSort([[2, 3, 4], [1, 2, 10], [5, 2, 1], [3, 8, 1]], 3))
    .toStrictEqual([[5, 2, 1], [3, 8, 1], [2, 3, 4], [1, 2, 10]]);
  expect(customizedSort([[2, 3, 4], [1, 2, 10], [5, 2, 1]], 3))
    .toStrictEqual([[5, 2, 1], [2, 3, 4], [1, 2, 10]]);
});

test('sumOfMod', () => {
  expect(sumOfMod([2, 2, 6], 2)).toBe(0);
  expect(sumOfMod([1, 5, 10], 3)).toBe(4);
});
