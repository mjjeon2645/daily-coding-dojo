import solution from './solution';

test('solution', () => {
  expect(solution([5, 9, 7, 10], 5)).toStrictEqual([5, 10]);
  expect(solution([2, 36, 1, 3], 1)).toStrictEqual([1, 2, 3, 36]);
  expect(solution([3, 2, 6], 10)).toStrictEqual([-1]);
});
