export function getGcd(small, large, divisor) {
  if (large % divisor === 0 && small % divisor === 0) {
    return divisor;
  }

  return getGcd(small, large, divisor - 1);
}

export function getLcm(small, large, gcd) {
  return (small * large) / gcd;
}

export default function solution(n, m) {
  const small = Math.min(n, m);
  const large = Math.max(n, m);
  const divisor = small;

  const gcd = getGcd(small, large, divisor);
  const lcm = getLcm(small, large, gcd);

  return [gcd, lcm];
}
