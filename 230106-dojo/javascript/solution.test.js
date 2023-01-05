const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(
    ['muzi', 'frodo', 'apeach', 'neo'],
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    2,
  ))
    .toStrictEqual([2, 1, 1, 0]);

  expect(solution(
    ['con', 'ryan'],
    ['ryan con', 'ryan con', 'ryan con', 'ryan con'],
    3,
  ))
    .toStrictEqual([0, 0]);
});
