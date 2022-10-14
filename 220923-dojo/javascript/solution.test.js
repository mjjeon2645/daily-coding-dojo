// 참고: https://velog.io/@tnehd1998/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%96%91%EA%B6%81%EB%8C%80%ED%9A%8C-JavaScript
// 주말에 시간내서 공부하려 했는데 이번주차 강의 리스트 보고 이럴 때가 아니라고 생각함.

import solution from './solution';

test('sample test', () => {
  expect(solution(5, [2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0]))
    .toStrictEqual([0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0]);

  expect(solution(1, [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]))
    .toStrictEqual([-1]);
});
