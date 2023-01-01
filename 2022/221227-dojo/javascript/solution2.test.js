import emojify from './solution2';

test('emojify', () => {
  expect(emojify(' some blank spaces', '😀')).toBe('😀some😀blank😀spaces');
  expect(emojify('hello', '😀')).toBe('invalid string');
});
