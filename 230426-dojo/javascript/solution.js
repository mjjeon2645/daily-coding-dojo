export default function gradingStudents(grades) {
  const result = [];

  for (let i = 0; i < grades.length; i += 1) {
    const originalGrade = grades[i];

    if (originalGrade < 38) {
      result.push(originalGrade);
      continue;
    }

    let nextMultipleNumber = 0;

    const remain = originalGrade % 5;

    if (!remain) {
      nextMultipleNumber = originalGrade;
    } else {
      nextMultipleNumber = originalGrade + (5 - remain);
    }

    if (nextMultipleNumber - originalGrade < 3) {
      result.push(nextMultipleNumber);
    } else {
      result.push(originalGrade);
    }
  }

  return result;
}
