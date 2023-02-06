import solution from './solution';

test('solution', () => {
  expect(solution([2, 3, 3, 5])).toStrictEqual([3, 5, 5, -1]);
  expect(solution([9, 1, 5, 3, 6, 2])).toStrictEqual([-1, 5, 6, 6, -1, -1]);
});
