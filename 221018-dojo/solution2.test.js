import solution2 from './solution2';

test('solution2', () => {
  expect(solution2('1 2 3 4')).toBe('1 4');
  expect(solution2('-1 -2 -3 -4')).toBe('-4 -1');
  expect(solution2('3 1 5')).toBe('1 5');
});
