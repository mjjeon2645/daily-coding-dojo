import solution from './solution';

test('solution', () => {
  expect(solution(0)).toBe(0);
  expect(solution(1)).toBe(1);
  expect(solution(2)).toBe(2);
  expect(solution(3)).toBe(3);

  expect(solution(4)).toBe(5);
});
