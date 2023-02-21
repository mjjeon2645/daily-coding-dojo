import solution, { calculateArea, collatzArray, integral } from './solution';

test('solution', () => {
  expect(solution(5, [[0, 0], [0, -1], [2, -3], [3, -3]]))
    .toStrictEqual([33.0, 31.5, 0.0, -1.0]);
  expect(solution(5, [[0, 0], [0, -1], [2, -3], [3, -3], [2, -2]]))
    .toStrictEqual([33.0, 31.5, 0.0, -1.0, 6]);
});

test('collatzArray', () => {
  expect(collatzArray(5)).toStrictEqual([5, 16, 8, 4, 2, 1]);
  expect(collatzArray(10)).toStrictEqual([10, 5, 16, 8, 4, 2, 1]);
  expect(collatzArray(2)).toStrictEqual([2, 1]);
});

test('calculateArea', () => {
  expect(calculateArea([5, 16, 8, 4, 2, 1])).toStrictEqual([10.5, 12, 6, 3, 1.5]);
  expect(calculateArea([2, 1])).toStrictEqual([1.5]);
  expect(calculateArea([2, 2, 2, 2, 1])).toStrictEqual([2, 2, 2, 1.5]);
});

test('integral', () => {
  expect(integral(5, [10.5, 12, 6, 3, 1.5], [[0, 0], [0, -1], [2, -3], [3, -3]]))
    .toStrictEqual([33.0, 31.5, 0.0, -1.0]);
});
