export default function solution(price, money, count) {
  const array = new Array(count).fill(0).map((_, index) => price * (index + 1));

  const result = array.reduce((prev, cur) => prev + cur, 0);

  return money < result ? result - money : 0;
}
