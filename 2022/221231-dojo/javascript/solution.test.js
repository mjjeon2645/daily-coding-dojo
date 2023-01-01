import solution from './solution';

test('solution', () => {
  expect(solution('AB', 1)).toBe('BC');
  expect(solution('z', 1)).toBe('a');
  expect(solution('a B z', 4)).toBe('e F d');
});
