export default function solution(board, moves) {
  let count = 0;
  const stack = [];
  for (let i = 0; i < moves.length; i += 1) {
    const now = moves[i] - 1;
    for (let j = 0; j < board.length; j += 1) {
      if (board[j][now] !== 0) {
        if (stack[stack.length - 1] === board[j][now]) {
          stack.pop();
          count += 2;
        } else {
          stack.push(board[j][now]);
        }
        board[j][now] = 0;
        break;
      }
    }
  }
  return count;
}

// const board = [
//   [0, 0, 0, 0, 0],
//   [0, 0, 1, 0, 3],
//   [0, 2, 5, 0, 1],
//   [4, 2, 4, 4, 2],
//   [3, 5, 1, 3, 1],
// ];

// const moves = [1, 5, 3, 5, 1, 2, 1, 4];

// export default function solution() {
//   let answer = 0;
//   const stack = [];

//   for (let i = 0; i < moves.length; i += 1) {
//     const column = moves[i] - 1;

//     console.log(column);

//     for (let j = 0; j < board.length; j += 1) {
//       if (board[j][column] === 0) {
//         stack.push(board[j][column]);
//         board[j][column] = 0;
//         break;
//       }

//       if (board[j][column] !== 0) {
//         if (stack[stack.length - 1] === board[j][column]) {
//           stack.pop();
//           answer += 2;
//           board[j][column] = 0;
//           break;
//         }
//       }
//     }
//   }

//   return answer;
// }
