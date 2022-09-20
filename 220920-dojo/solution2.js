// DFS = Depth First Search 깊이 우선 탐색
// 한 개의 큐와 한 개의 스택을 사용
// 미로게임 등에서 경로가 존재하는지를 확인하는데 사용
let answer = 0;

const dfs = (n, y, column, diagram1, diagram2) => {
  if (y === n) {
    answer += 1;
    return;
  }

  for (let i = 0; i < n; i += 1) {
    if (column.includes(i) || diagram1.includes(i + y) || diagram2.includes(i - y)) {
      continue;
    }

    column.push(i);
    diagram1.push(i + y);
    diagram2.push(i - y);
    dfs(n, y + 1, column, diagram1, diagram2);
    column.splice(column.indexOf(i), 1);
    diagram1.splice(diagram1.indexOf(i + y), 1);
    diagram2.splice(diagram2.indexOf(i - y), 1);
  }
};

function solution(n) {
  dfs(n, 0, [], [], []);
  return answer;
}
