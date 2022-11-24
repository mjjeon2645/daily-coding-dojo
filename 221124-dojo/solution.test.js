import solution from './solution';

test('solution', () => {
  expect(solution([3, 0, 6, 1, 5])).toBe(3);
});

test('edge case', () => {
  expect(solution([4, 4, 4, 4, 4])).toBe(4);
  expect(solution([4, 4, 4, 4, 5])).toBe(4);
  // expect(solution([0, 0, 0, 0])).toBe(0);
});
