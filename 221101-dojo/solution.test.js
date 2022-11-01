import solution from './solution';

test('solution', () => {
  expect(solution(10, 2)).toStrictEqual([4, 3]);
  expect(solution(8, 1)).toStrictEqual([3, 3]);
  expect(solution(24, 24)).toStrictEqual([8, 6]);
});
