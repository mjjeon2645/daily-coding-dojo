const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution(6)).expect(8);
  expect(solution(16)).expect(4);
  expect(solution(626331)).expect(-1);
});
