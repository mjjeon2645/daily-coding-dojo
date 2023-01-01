import solution from './solution';

test('samples', () => {
  expect(solution('AB', 1)).toStrictEqual('BC');
  expect(solution('z', 1)).toStrictEqual('a');
  expect(solution('a B z', 4)).toStrictEqual('e F d');
});
