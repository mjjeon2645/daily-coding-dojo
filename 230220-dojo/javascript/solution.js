export default function solution(k, tangerine) {
  let answer = 0;

  const dictionary = {};

  tangerine.forEach((item) => dictionary[item] = (dictionary[item] || 0) + 1);

  const array = Object.values(dictionary).sort((a, b) => b - a);

  let count = 0;

  array.forEach((value, index) => {
    answer += 1;
    count += value;

    if (count >= k) {
      array.splice(index + 1);
    }
  });

  return answer;
}
