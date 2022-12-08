const { default: solution } = require('./solution');

test('solution', () => {
  expect(solution([['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']])).toBe(5);
  expect(solution([['crow_mask', 'face'], ['blue_sunglasses', 'face'], ['smoky_makeup', 'face']])).toBe(3);
});
