const { default: gradingStudents } = require('./solution');

test('gradingStudents', () => {
  expect(gradingStudents([73, 67, 38, 33])).toStrictEqual([75, 67, 40, 33]);
});
