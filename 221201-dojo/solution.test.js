const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution('{{2},{2,1},{2,1,3},{2,1,3,4}}')).toStrictEqual([2, 1, 3, 4]);
  expect(solution('{{1,2,3},{2,1},{1,2,4,3},{2}}')).toStrictEqual([2, 1, 3, 4]);
  expect(solution('{{20,111},{111}}')).toStrictEqual([111, 20]);
  expect(solution('{{123}}')).toStrictEqual([123]);
  expect(solution('{{4,2,3},{3},{2,3,4,1},{2,3}}')).toStrictEqual([3, 2, 4, 1]);
});
