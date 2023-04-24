const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(
    ['i', 'drink', 'water'],
    ['want', 'to'],
    ['i', 'want', 'to', 'drink', 'water'],
  )).toBe('Yes');
  expect(solution(
    ['i', 'water', 'drink'],
    ['want', 'to'],
    ['i', 'want', 'to', 'drink', 'water'],
  )).toBe('No');
});
