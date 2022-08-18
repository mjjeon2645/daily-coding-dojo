function solution(words) {
  const answer = words.split(' ').filter((word) => word !== []).split('')
    .map((v, i) => (i % 2 === 0 ? v.toUpperCase() : v.toLowerCase().join('')).join(' '));
  return answer;
}
