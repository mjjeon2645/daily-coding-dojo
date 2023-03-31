const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(['.#...', '..#..', '...#.'])).toStrictEqual([0, 1, 3, 4]);
  expect(solution(['..........', '.....#....', '......##..', '...##.....', '....#.....']))
    .toStrictEqual([1, 3, 5, 8]);
  expect(solution(['.##...##.', '#..#.#..#', '#...#...#', '.#.....#.', '..#...#..', '...#.#...', '....#....']))
    .toStrictEqual([0, 0, 7, 9]);
  expect(solution(['..', '#.'])).toStrictEqual([1, 0, 2, 1]);
});
