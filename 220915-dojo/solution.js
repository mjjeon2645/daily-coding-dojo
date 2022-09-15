export function screenLottosAndWinNums(sortedLottos, sortedWinNums) {
  const resultArray = sortedLottos.map((number) => {
    if (number === 0) {
      return 0;
    }

    if (sortedWinNums.includes(number)) {
      return -1;
    }

    return 1;
  });

  return resultArray;
}

export function makeGradeArray(resultArray) {
  const countZero = resultArray.filter((number) => number === 0).length;
  const countCorrect = resultArray.filter((number) => number === -1).length;
  //   const countIncorrect = resultArray.filter((number) => number === 1).length;

  const maxGrade = countZero + countCorrect === 0 ? 6 : 7 - (countZero + countCorrect);
  const minGrade = countCorrect === 0 ? 6 : 7 - countCorrect;

  const answer = [maxGrade, minGrade];
  return answer;
}

export default function solution(lottos, winNums) {
  const sortedLottos = [...lottos].sort((a, b) => a - b);
  const sortedWinNums = [...winNums].sort((a, b) => a - b);

  const resultArray = screenLottosAndWinNums(sortedLottos, sortedWinNums);

  const answer = makeGradeArray(resultArray);

  return answer;
}
