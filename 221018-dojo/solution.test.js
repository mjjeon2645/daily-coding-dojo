import solution, { makeArray, getMinNumber, getMaxNumber } from './solution';

test('makeArray', () => {
  expect(makeArray('1 4')).toStrictEqual(['1', '4']);
  expect(makeArray('-1 -2 -3 -4')).toStrictEqual(['-1', '-2', '-3', '-4']);
});

test('getMinNumber', () => {
  expect(getMinNumber(['1', '4'])).toBe(1);
});

test('getMaxNumber', () => {
  expect(getMaxNumber(['1', '4'])).toBe(4);
});

test('solution', () => {
  expect(solution('1 2 3 4')).toBe('1 4');
  expect(solution('-1 -2 -3 -4')).toBe('-4 -1');
});
