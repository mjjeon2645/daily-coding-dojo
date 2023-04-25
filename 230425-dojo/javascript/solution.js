// 시간 초과가 나면 탐색을 젋반으로 줄일 수 있는 방법을 찾아볼까...

export default function solution(players, callings) {
  const playerScore = new Map();
  const scorePlayer = new Map();

  players.forEach((player, index) => {
    playerScore.set(player, index + 1);
    scorePlayer.set(index + 1, player);
  });

  for (let i = 0; i < callings.length; i += 1) {
    const calledName = callings[i];

    const prevScore = playerScore.get(calledName);
    const prevWinner = scorePlayer.get(prevScore - 1);

    scorePlayer.set(prevScore - 1, calledName);
    scorePlayer.set(prevScore, prevWinner);

    playerScore.set(calledName, prevScore - 1);
    playerScore.set(prevWinner, prevScore);
  }

  const result = [];

  for (let i = 1; i <= playerScore.size; i += 1) {
    result[i - 1] = (scorePlayer.get(i));
  }

  return result;
}
