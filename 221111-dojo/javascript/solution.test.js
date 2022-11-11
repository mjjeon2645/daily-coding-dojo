import solution, { initDictionary } from './solution';

test('solution', () => {
  expect(solution('KAKAO')).toStrictEqual([11, 1, 27, 15]);
  expect(solution('TOBEORNOTTOBEORTOBEORNOT'))
    .toStrictEqual([20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]);
  expect(solution('ABABABABABABABAB')).toStrictEqual([1, 2, 27, 29, 28, 31, 30]);
});

test('initDictionary', () => {
  expect(initDictionary()[1]).toBe('B');
});
