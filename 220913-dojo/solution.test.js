import { removeDuplicateItem, convertToReportedArray, countReportedNumber } from './solution';

test('Remove Duplicate Items in Report Array', () => {
  expect(removeDuplicateItem([])).toStrictEqual([]);
  expect(removeDuplicateItem([
    'muzi frodo',
    'apeach frodo',
    'frodo neo',
    'muzi neo',
    'apeach muzi',
  ])).toStrictEqual([
    'muzi frodo',
    'apeach frodo',
    'frodo neo',
    'muzi neo',
    'apeach muzi',
  ]);
  expect(removeDuplicateItem(['ryan con', 'ryan con', 'ryan con', 'ryan con']))
    .toStrictEqual(['ryan con']);
});

test('convertedToReportedArray', () => {
  expect(convertToReportedArray([
    'muzi frodo',
    'apeach frodo',
  ])).toStrictEqual([['muzi', 'frodo'], ['apeach', 'frodo']]);
});

test('countReportedNumber', () => {
//   expect(countReportedNumber(['con', 'ryan'], [['ryan', 'con']]))
//     .toStrictEqual([['con', 1], ['ryan', 0]]);

});
