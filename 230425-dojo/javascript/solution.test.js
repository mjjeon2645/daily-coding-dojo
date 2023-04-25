const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(
    ['mumu', 'soe', 'poe', 'kai', 'mine'],
    ['kai', 'kai', 'mine', 'mine'],
  )).toStrictEqual(
    ['mumu', 'kai', 'mine', 'soe', 'poe'],
  );
  expect(solution(
    ['mumu', 'soe', 'poe', 'kai', 'mine'],
    ['kai', 'mine', 'kai', 'mine'],
  )).toStrictEqual(
    ['mumu', 'kai', 'mine', 'soe', 'poe'],
  );
  expect(solution(
    ['mumu', 'soe', 'poe', 'kai', 'mine'],
    ['poe', 'mine', 'kai', 'mine'],
  )).toStrictEqual(
    ['mumu', 'poe', 'soe', 'mine', 'kai'],
  );
});
