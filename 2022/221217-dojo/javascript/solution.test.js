import solution, { findIndex, makeArray } from './solution';

// test('solution', () => {
expect(solution(10)).toBe(3);
expect(solution(12)).toBe(11);
// });

test('makeArray', () => {
  expect(makeArray(3)).toStrictEqual([NaN, 0, 1]);
  expect(makeArray(5)).toStrictEqual([NaN, 0, 1, 2, 1]);
  expect(makeArray(10)).toStrictEqual([NaN, 0, 0, 1, 2, 0, 4, 3, 2, 1]);
});

test('findIndex', () => {
  expect(findIndex([NaN, 0, 1, 2, 1])).toBe(2);
  expect(findIndex([NaN, 0, 0, 1, 2, 0, 4, 3, 2, 1])).toBe(3);
});
