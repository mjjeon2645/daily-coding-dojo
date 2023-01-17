import solution from './solution';

test('solution', () => {
  expect(solution([1, 1, 3, 3, 0, 1, 1])).toStrictEqual([1, 3, 0, 1]);
  expect(solution([4, 4, 4, 3, 3])).toStrictEqual([4, 3]);
});
