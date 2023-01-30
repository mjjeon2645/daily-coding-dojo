const { default: queensAttack } = require('./queensAttack');

test('queensAttack', () => {
  expect(queensAttack(8, 0, 4, 4, [])).toBe(27);
  expect(queensAttack(8, 1, 4, 4, [[3, 5]])).toBe(24);
  expect(queensAttack(4, 0, 4, 4, [])).toBe(9);
  expect(queensAttack(1, 0, 1, 1, [])).toBe(0);
});
