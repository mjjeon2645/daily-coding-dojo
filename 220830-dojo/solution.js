// 마라톤 경기에 참여한 선수에 대한 이름 배열 participant
// 마라톤 경기에서 완주한 사람에 대한 이름 배열 completion
// 완주하지 못한 선수는 단 한명
// 참가자 중에는 동명이인 있을 수 있음

// (1) 먼저 정렬.
// (2) participant에 1명의 사람이 있다고 치고 그 2명 중에 1명을 pop하여 빼보자
//   2명의 이름을 각각 a, b 라고 하고 완주한 사람을 a라고 했을 때 리턴은 b가 되어야겠지?

// 이뮤터블하게 정렬을 하는 방법에 대해서는 홀맨님 팁을 또 써보자. [...array]

// for문을 돌리지 않고도 쓸수있는 방법이 없을까..?
// 지금 제일 걸리는건, sort함수를 각각 써서 만든 어레이를 새로운 newArray1, 2라는 변수에 또다시 할당
// 이걸 굳이 왜 또 할당해야 하는건지 나조차도 의문.
// map을 써보려 했는데... 아까 시도한 모양새는 아래와 같음
// newArray1.map(s, index => s[index] === newArray2[index] ? 여기에는 pop, : 아니라면 이 값을 리턴)
// 뭔가 이런 형태로... 할수는 없을까...

export function sortParticipantArray(participant) {
  return [...participant].sort();
}

export function sortCompletionArray(completion) {
  return [...completion].sort();
}

export function solution(participant, completion) {
  const newArray1 = sortParticipantArray(participant);
  const newArray2 = sortCompletionArray(completion);

  for (let i = 0; i < newArray1.length; i += 1) {
    if (newArray1[i] === newArray2[i]) {
      continue;
    }
    if (newArray1[i] !== newArray2[i]) {
      return [newArray1[i]];
    }
  }

  return [newArray2[newArray1.length]];
}
