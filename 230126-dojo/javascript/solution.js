function lowerBound(array, target) {
  let left = 0;
  let right = array.length;

  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    if (array[mid] <= target) {
      right = mid;
      continue;
    }

    left = mid + 1;
  }

  return left;
}

export default function climbingLeaderboard(ranked, player) {
  const resultArray = [];
  const removeDuplicateItemWithRanked = [...new Set(ranked)];

  for (let i = 0; i < player.length; i += 1) {
    resultArray.push(lowerBound(removeDuplicateItemWithRanked, player[i]) + 1);
  }

  return resultArray;
}

// export default function climbingLeaderboard(ranked, player) {
//   const resultArray = [];
//   const removeDuplicateItemWithRanked = [...new Set(ranked)];

//   for (let i = 0; i < player.length; i += 1) {
//     const rankedWithPlayer = [...removeDuplicateItemWithRanked, player[i]].sort((a, b) => b - a);

//     const rankOfPlayer = rankedWithPlayer.findIndex((value) => value === player[i]) + 1;

//     resultArray.push(rankOfPlayer);
//   }

//   return resultArray;
// }
