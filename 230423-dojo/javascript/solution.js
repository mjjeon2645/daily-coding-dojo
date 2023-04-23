export function makeDictionary(keymap) {
  const dictionary = {};

  for (let i = 0; i < keymap.length; i += 1) {
    const words = keymap[i];

    for (let j = 0; j < words.length; j += 1) {
      const word = words[j];

      if (!dictionary[word]) {
        dictionary[word] = j + 1;
        continue;
      }

      if (dictionary[word] > j + 1) {
        dictionary[word] = j + 1;
      }
    }
  }

  return dictionary;
}

export default function solution(keymap, targets) {
  const answer = [];

  const dictionary = makeDictionary(keymap);

  for (let i = 0; i < targets.length; i += 1) {
    let accumulator = 0;
    const words = targets[i];

    for (let j = 0; j < words.length; j += 1) {
      const word = words[j];

      const index = dictionary[word];

      if (!index) {
        accumulator = 0;
        answer.push(-1);
        break;
      }

      accumulator += index;
    }

    if (accumulator !== 0) {
      answer.push(accumulator);
    }
  }

  return answer;
}
