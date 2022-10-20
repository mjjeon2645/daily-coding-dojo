import solution, { toSmall, toArray, makeResult } from './solution';

test('solution', () => {
//   expect(solution('for the last week')).toBe('For The Last Week');
});

test('toSmall', () => {
  expect(toSmall('3people unFollowed me')).toBe('3people unfollowed me');
  expect(toSmall('3people unFollowed me   ')).toBe('3people unfollowed me   ');
  expect(toSmall('3')).toBe('3');
  expect(toSmall('  ')).toBe('  ');
});

test('toArray', () => {
  expect(toArray('3follow   ')).toStrictEqual(['3follow', '', '', '']);
  expect(toArray('hello world')).toStrictEqual(['hello', 'world']);
});

test('makeResult', () => {
  expect(makeResult(['hello', 'world'])).toStrictEqual('Hello World');
  expect(makeResult([' ollow'])).toStrictEqual(' ollow');
  expect(makeResult(['follow', 's'])).toStrictEqual('Follow S');
});
