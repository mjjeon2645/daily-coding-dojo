export function initDictionary() {
  const dictionary = [];

  for (let i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(0); i += 1) {
    dictionary.push(String.fromCharCode(i));
  }

  return dictionary;
}

export default function solution(message) {
  const answer = [];

  // 사전 준비
  const dictionary = initDictionary();

  let i = 0;

  while (i < message.length) {
    let j = 1;

    while (dictionary.indexOf(message.substring(i, i + j)) !== -1 && i + j <= message.length) {
      j += 1;
    }

    dictionary.push(message.substring(i, i + j));

    answer.push(dictionary.indexOf(message.substring(i, i + j - 1)) + 1);
    i += j - 1;
  }

  return answer;
}
