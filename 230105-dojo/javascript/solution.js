export default function solution(n, lost, reserve) {
  const realLost = lost.sort().filter((value) => !reserve.includes(value));
  const realReserve = reserve.sort().filter((value) => !lost.includes(value));

  if (!realLost.length) {
    return n;
  }

  const resultArray = realLost.map((value) => {
    if (realReserve.includes(value - 1)) {
      realReserve.splice(realReserve.indexOf(value - 1), 1);
      return true;
    }

    if (realReserve.includes(value + 1)) {
      realReserve.splice(realReserve.indexOf(value + 1), 1);
      return true;
    }

    return false;
  });

  return n - resultArray.filter((value) => value === false).length;
}
