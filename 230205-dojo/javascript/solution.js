export function converter(array) {
  return array.map((time) => time.map((value, index) => {
    const times = value.split(':');

    if (index === 0) {
      return 60 * Number(times[0]) + Number(times[1]);
    }

    return 60 * Number(times[0]) + Number(times[1]) + 10;
  })).sort((a, b) => a[0] - b[0]);
}

export default function solution(book_time) {
  const convertedArray = converter(book_time);

  let count = 0;

  for (let i = 0; i < convertedArray.length; i += 1) {
    if (convertedArray[i].length === 3) {
      continue;
    }

    count += 1;
    convertedArray[i].push(true);
    let end = convertedArray[i][1];

    let j = i + 1;

    while (j < convertedArray.length) {
      if (i === convertedArray.length - 1) {
        break;
      }

      if (convertedArray[j][0] - end >= 0) {
        convertedArray[j].push(true);
        end = convertedArray[j][1];
      }

      j += 1;
    }
  }

  return count;
}
