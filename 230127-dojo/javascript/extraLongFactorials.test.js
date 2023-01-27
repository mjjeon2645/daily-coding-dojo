const { default: extraLongFactorials } = require('./extraLongFactorials');

test('extraLongFactorials', () => {
  expect(extraLongFactorials(25)).toBe(15511210043330985984000000);
  expect(extraLongFactorials(45)).toBe(119622220865480194561963161495657715064383733760000000000);
  expect(extraLongFactorials(1)).toBe(1);
  expect(extraLongFactorials(2)).toBe(2);
  expect(extraLongFactorials(3)).toBe(6);
  expect(extraLongFactorials(4)).toBe(24);
});
