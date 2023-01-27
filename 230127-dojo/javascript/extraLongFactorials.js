// export default function extraLongFactorials(n) {
//   let accumulate = BigInt(1);
//   let number = BigInt(n);

//   while (number > 0) {
//     accumulate *= number;
//     number -= BigInt(1);
//   }

//   console.log(String(accumulate));
// }

export default function extraLongFactorials(n) {
  let totalValue = BigInt(n);

  for (let i = n - 1; i > 1; i -= 1) {
    totalValue *= BigInt(i);
  }

  return totalValue;
}
