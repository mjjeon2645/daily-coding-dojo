import solution from './solution';

test('solution', () => {
  expect(solution('()()')).toBe(true);
  expect(solution('(())()')).toBe(true);
  expect(solution(')()(')).toBe(false);
  expect(solution('(()(')).toBe(false);
});
