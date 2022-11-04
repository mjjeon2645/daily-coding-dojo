const { default: solution, makeArray } = require('./solution');

test('makeArray', () => {
  expect(makeArray('FRANCE')).toStrictEqual(['fr', 'ra', 'an', 'nc', 'ce']);
  expect(makeArray('e=m*c^2')).toStrictEqual([]);
});

test('solution', () => {
  expect(solution('FRANCE', 'french')).toBe(16384);
  expect(solution('handshake', 'shake hands')).toBe(65536);
  expect(solution('aa1+aa2', 'AAAA12')).toBe(43690);
  expect(solution('E=M*C^2', 'e=m*c^2')).toBe(65536);
});
