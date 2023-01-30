export default function queensAttack(n, k, r_q, c_q, obstacles) {
  // 1. 가로줄의 갯수 => n - 1(n개에서 퀸이 있는 자리 빼기)
  // 2. 세로줄의 갯수 => n - 1(n개에서 퀸이 있는 자리 빼기)

  let results = 0;
  const obstaclesSet = new Set();

  obstacles.forEach((value) => obstaclesSet.add(`${value[0]}:${value[1]}`));

  const process = (rowPosition, columnPosition) => {
    let row = r_q + rowPosition;
    let column = c_q + columnPosition;

    while (row <= n && row > 0 && column <= n && column > 0) {
      if (obstaclesSet.has(`${row}:${column}`)) {
        return;
      }

      results += 1;
      row += rowPosition;
      column += columnPosition;
    }
  };

  // position. 상/하/좌/우/좌상/좌하/우상/우하

  process(1, 0);
  process(-1, 0);
  process(0, -1);
  process(0, 1);
  process(1, -1);
  process(-1, -1);
  process(1, 1);
  process(-1, 1);

  return results;
}
