import solution, { process } from './solution';

test('solution', () => {
  expect(solution(8, 4, 7)).toBe(3);
});

test('process', () => {
  expect(process(4, 7, [])).toStrictEqual([1, 1, 1]);
});
