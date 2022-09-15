import solution, { screenLottosAndWinNums } from './solution';

test('finalTest', () => {
  expect(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19]))
    .toStrictEqual([3, 5]);
  expect(solution([0, 0, 0, 0, 0, 0], [38, 19, 20, 40, 15, 25]))
    .toStrictEqual([1, 6]);
  expect(solution([45, 4, 35, 20, 3, 9], [20, 9, 3, 45, 4, 35]))
    .toStrictEqual([1, 1]);
});

test('screening', () => {
  expect(screenLottosAndWinNums([0, 0, 1, 25, 31, 44], [1, 6, 10, 19, 31, 45]))
    .toStrictEqual([0, 0, -1, 1, -1, 1]);
  expect(screenLottosAndWinNums([0, 0, 0, 0, 0, 0], [15, 19, 20, 25, 38, 40]))
    .toStrictEqual([0, 0, 0, 0, 0, 0]);
});
