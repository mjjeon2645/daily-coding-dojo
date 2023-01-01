export default function solution(password, length) {
  const upperCases = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
  const lowerCases = 'abcdefghijklmnopqrstuvwxyz';

  const caesarPassword = password.split('')
    .map((word) => {
      const upperIndex = upperCases.indexOf(word);

      if (upperIndex !== -1) {
        return upperIndex + length <= 25
          ? upperCases[upperIndex + length]
          : upperCases[upperIndex + length - 26];
      }

      const lowerIndex = lowerCases.indexOf(word);

      if (lowerIndex !== -1) {
        return lowerIndex + length <= 25
          ? lowerCases[lowerIndex + length]
          : lowerCases[lowerIndex + length - 26];
      }

      return ' ';
    });

  return caesarPassword.join('');
}
