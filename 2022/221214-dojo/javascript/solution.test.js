import solution, { makeArray } from './solution';

test('solution', () => {
  expect(solution(10)).toBeTruthy();
  expect(solution(12)).toBeTruthy();
  expect(solution(11)).toBeFalsy();
  expect(solution(13)).toBeFalsy();
});

test('makeArray', () => {
  expect(makeArray(10)).toStrictEqual(['1', '0']);
});
