import { solution } from './solution';

test('sample', () => {
  expect(solution('try hello world')).toBe('TrY HeLlO WoRlD');
  expect(solution('  try HELLOW   world')).toBe('  TrY HeLlOw   WoRlD');
  expect(solution(' t r Y h e L L o')).toBe(' T R Y H E L L O');
});
