const keypad = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
  ['*', 0, '#'],
];

export default function solution(numbers, hand) {
  const answer = [];

  let left_hand = [3, 0];
  let right_hand = [3, 2];

  const numbers_index = numbers.map((num) => {
    let index;
    for (let i = 0; i < keypad.length; i += 1) {
      for (let j = 0; j < keypad[0].length; j += 1) {
        if (num === keypad[i][j]) {
          index = [i, j];
          break;
        }
      }
    }
    return index;
  });

  numbers_index.forEach((index) => {
    if (index[1] === 0) {
      answer.push('L');
      left_hand = index;
    } else if (index[1] === 2) {
      answer.push('R');
      right_hand = index;
    } else {
      const left_distance = Math.abs(index[0] - left_hand[0]) + Math.abs(index[1] - left_hand[1]);
      const right_distance = Math.abs(index[0] - right_hand[0]) + Math.abs(index[1] - right_hand[1]);
      if (left_distance === right_distance) {
        if (hand == 'left') {
          answer.push('L');
          left_hand = index;
        } else {
          answer.push('R');
          right_hand = index;
        }
      }

      if (left_distance > right_distance) {
        answer.push('R');
        right_hand = index;
      }

      if (left_distance < right_distance) {
        answer.push('L');
        left_hand = index;
      }
    }
  });

  return answer.join('');
}
