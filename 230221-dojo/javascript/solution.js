export default function solution(topping) {
  let answer = 0;

  const allToppings = new Map();
  const brother = new Map();

  topping.forEach((item) => {
    allToppings.set(item, (allToppings.get(item) || 0) + 1);
  });

  for (const i of topping) {
    allToppings.set(i, allToppings.get(i) - 1);

    brother.set(i, true);

    if (!allToppings.get(i)) {
      allToppings.delete(i);
    }

    if (allToppings.size === brother.size) {
      answer += 1;
    }

    if (allToppings.size < brother.size) {
      break;
    }
  }

  return answer;
}

// export function sliceCake(topping) {
//   const slices = {};
//   for (let i = 0; i < topping.length - 1; i += 1) {
//     slices[i] = {
//       me: new Set(topping.slice(0, i + 1)).size,
//       brother: new Set(topping.slice(i + 1, topping.length)).size,
//     };
//   }

//   return slices;
// }

// export default function solution(topping) {
//   let answer = 0;

//   const slices = sliceCake(topping);

//   for (let i = 0; i < topping.length - 1; i += 1) {
//     if (slices[i].me === slices[i].brother) {
//       answer += 1;
//     }
//   }

//   return answer;
// }
