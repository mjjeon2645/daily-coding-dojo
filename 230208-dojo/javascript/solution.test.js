import solution from './solution';

test('solution', () => {
  expect(solution([3, 8, 9, 7, 6], 3)).toStrictEqual([9, 7, 6, 3, 8]);
  expect(solution([0, 0, 0], 1)).toStrictEqual([0, 0, 0]);
  expect(solution([1, 2, 3, 4], 4)).toStrictEqual([1, 2, 3, 4]);
  expect(solution([5, -1000], 1)).toStrictEqual([-1000, 5]);
});
