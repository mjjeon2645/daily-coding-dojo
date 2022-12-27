import solution from './solution';

test('solution', () => {
  expect(solution([[1, 2], [2, 3]], [[3, 4], [5, 6]])).toStrictEqual([[4, 6], [7, 9]]);
  expect(solution([[1], [2]], [[3], [4]])).toStrictEqual([[4], [6]]);
});
