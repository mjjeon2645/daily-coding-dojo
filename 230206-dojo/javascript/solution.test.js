import solution, { validator } from './solution';

test('solution', () => {
  expect(solution(26)).toBe(5);
});

test('validator', () => {
  expect(validator('101')).toBe(true);
});
