export default function solution(n, words) {
  const wordsSet = new Set();

  for (let i = 0; i < words.length; i += 1) {
    const personNumber = (i % n) + 1;
    const turn = Math.floor(i / n) + 1;

    if (i === 0) {
      wordsSet.add(words[i]);
      continue;
    }

    const prevWord = words[i - 1];
    const thisWord = words[i];

    if (prevWord.charAt(prevWord.length - 1) !== thisWord.charAt(0)) {
      return [personNumber, turn];
    }

    const setSizeBeforeProcess = wordsSet.size;
    wordsSet.add(words[i]);
    const setSizeAfterProcess = wordsSet.size;

    if (setSizeBeforeProcess === setSizeAfterProcess) {
      return [personNumber, turn];
    }
  }

  return [0, 0];
}
