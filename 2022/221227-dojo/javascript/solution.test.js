import solution, { makeArray, validatorToFindDuplicated } from './solution';

test('solution', () => {
  expect(solution([130, 191, 200, 10])).toBe(140);
});

test('makeArray', () => {
  expect(makeArray([10, 150, 151, 152])).toStrictEqual(['12', '11', '10', '10']);
});

test('validatorToFindDuplicated', () => {
  expect(validatorToFindDuplicated(['10', '10', '11', '12'])).toBe(1);
  expect(validatorToFindDuplicated(['10', '11', '12', '13'])).toBe(-1);
});
