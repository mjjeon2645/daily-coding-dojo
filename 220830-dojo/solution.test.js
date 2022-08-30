import { sortParticipantArray, sortCompletionArray, solution } from './solution';

test('sortingParticipantArray', () => {
  expect(sortParticipantArray(['a', 'ab', 'ab'], ['b', 'a']))
    .toStrictEqual(['a', 'ab', 'ab'], ['a', 'b']);
});

test('sortingCompletionARray', () => {
  expect(sortCompletionArray(['a', 'z', 'd'], ['b', 'a']))
    .toStrictEqual(['a', 'd', 'z'], ['a', 'b']);
});

test('solution', () => {
  expect(solution(['leo', 'kiki', 'eden'], ['eden', 'kiki']))
    .toStrictEqual('leo');
  expect(solution(
    ['marina', 'josipa', 'nikola', 'vinko', 'filipa'],
    ['josipa', 'filipa', 'marina', 'nikola'],
  ))
    .toStrictEqual('vinko');
  expect(solution(
    ['mislav', 'stanko', 'mislav', 'ana'],
    ['stanko', 'ana', 'mislav'],
  ))
    .toStrictEqual('mislav');
});
