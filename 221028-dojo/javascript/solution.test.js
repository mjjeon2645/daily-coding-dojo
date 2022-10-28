import solution, { countOne } from './solution';

test('solution', () => {
  expect(solution(78)).toBe(83);
  expect(solution(15)).toBe(23);
});

test('countOne', () => {
  expect(countOne(78)).toBe(4);
  expect(countOne(83)).toBe(4);
  expect(countOne(15)).toBe(4);
  expect(countOne(23)).toBe(4);
});
