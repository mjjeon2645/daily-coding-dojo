import solution, { removeZero, countingRemovalOfZero, process } from './solution';

test('solution', () => {
  expect(solution('110010101001')).toStrictEqual([3, 8]);
  expect(solution('01110')).toStrictEqual([3, 3]);
  expect(solution('1111111')).toStrictEqual([4, 1]);
});

test('removeZero', () => {
  expect(removeZero('01110')).toBe('111');
  expect(removeZero('1111111')).toBe('1111111');
});

test('countingRemovalOfZero', () => {
  expect(countingRemovalOfZero('01110', [0])).toStrictEqual([0, 2]);
  expect(countingRemovalOfZero('01110', [0, 2])).toStrictEqual([0, 2, 2]);
});

test('process', () => {
  expect(process([0], [0], '01110')).toStrictEqual([3, 3]);
});
