export default function solution(nums) {
  const distictDuplicatedItems = new Set();

  nums.forEach((value) => distictDuplicatedItems.add(value));

  const options = distictDuplicatedItems.size;
  const availableAmount = nums.length / 2;

  return availableAmount >= options ? options : availableAmount;
}

// function solution(nums) {
//     const distictDuplicatedItems = new Set(nums);

//     const options = distictDuplicatedItems.size;
//     const availableAmount = nums.length / 2;

//     return availableAmount >= options ? options : availableAmount;
//   }
