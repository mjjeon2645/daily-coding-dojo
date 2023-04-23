const { default: solution, makeDictionary } = require('./solution');

test('solution', () => {
  expect(solution(['ABACD', 'BCEFD'], ['ABCD', 'AABB'])).toStrictEqual([9, 4]);
  expect(solution(['AA'], ['B'])).toStrictEqual([-1]);
  expect(solution(['ABCE'], ['ABDE'])).toStrictEqual([-1]);
});

test('makeDictionary', () => {
  expect(makeDictionary(['ABACD', 'BCEFD'])).toStrictEqual({
    A: 1,
    B: 1,
    C: 2,
    D: 5,
    E: 3,
    F: 4,
  });
});
