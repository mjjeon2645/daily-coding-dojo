export default function solution(price, money, count) {
  const totalPrice = new Array(count).fill(0)
    .map((_, index) => price * (index + 1))
    .reduce((pre, cur) => pre + cur, 0);

  return money - totalPrice >= 0 ? 0 : -(money - totalPrice);
}
