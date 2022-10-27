import solution, { makeArray, accumulator } from './solution';

test('solution', () => {
  expect(solution(15)).toBe(4);
});

test('makeArray', () => {
  expect(makeArray(3)).toStrictEqual([1, 2, 3]);
});

test('accumulator', () => {
  expect(accumulator([1, 2, 3])).toBe(6);
});
