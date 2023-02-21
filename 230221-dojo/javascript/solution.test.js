const { default: solution, sliceCake } = require('./solution');

test('solution', () => {
  expect(solution([1, 2, 1, 3, 1, 4, 1, 2])).toBe(2);
  expect(solution([1, 2, 3, 1, 4])).toBe(0);
});

// test('sliceCake', () => {
//   expect(sliceCake([1, 2, 3, 1, 4])).toStrictEqual({
//     0: { me: 1, brother: 4 },
//     1: { me: 2, brother: 3 },
//     2: { me: 3, brother: 2 },
//     3: { me: 3, brother: 1 },
//   });
//   expect(sliceCake([1, 1])).toStrictEqual({
//     0: { me: 1, brother: 1 },
//   });
//   expect(sliceCake([1, 1, 3])).toStrictEqual({
//     0: { me: 1, brother: 2 },
//     1: { me: 1, brother: 1 },
//   });

//   expect(sliceCake([1, 2, 1, 3, 1, 4, 1, 2])).toStrictEqual({
//     0: { me: 1, brother: 4 },
//     1: { me: 2, brother: 4 },
//     2: { me: 2, brother: 4 },
//     3: { me: 3, brother: 3 },
//     4: { me: 3, brother: 3 },
//     5: { me: 4, brother: 2 },
//     6: { me: 4, brother: 1 },
//   });
// });
