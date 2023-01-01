import { solution, converterToNumber, toIntegerNumber } from './solution';

test('converterToNumberFunction', () => {
  expect(converterToNumber('5five5six')).toBe('5556');
  expect(converterToNumber('2foursix')).toBe('246');
  expect(converterToNumber('sevenzerofive')).toBe('705');
});

test('toIntegerNumberFunction', () => {
  expect(toIntegerNumber('514')).toBe(514);
  expect(toIntegerNumber('10')).toBe(10);
  expect(toIntegerNumber('4')).toBe(4);
});

test('solution', () => {
  expect(solution('5five5six')).toBe(5556);
  expect(solution('5')).toBe(5);
  expect(solution('0')).toBe(0);
  expect(solution('zero')).toBe(0);
});
