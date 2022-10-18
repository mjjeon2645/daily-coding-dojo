import solution3 from './solution3';

test('solution3', () => {
  expect(solution3('1 2 3 4')).toBe('1 4');
  expect(solution3('-1 -1')).toBe('-1 -1');
});
