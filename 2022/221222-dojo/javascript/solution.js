export default function solution(array) {
  return array.map((number, index) => {
    if (index === 0) {
      return number;
    }

    if (index !== 0 && array[index - 1] !== number) {
      return number;
    }

    return '';
  })
    .filter((value) => value !== '');
}

// export default function solution(array) {
//     return array.filter((value, index) => value !== array[index + 1]);
//   }
