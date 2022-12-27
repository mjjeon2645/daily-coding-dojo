export default function solution(arr1, arr2) {
  return arr1.map((array, row) => array.map((value, column) => value + arr2[row][column]));
}
