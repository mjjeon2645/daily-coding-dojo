// let input = require('fs').readFileSync('examples.txt').toString().trim('\n').split('\n');
let input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

const a = parseInt(input[0]);
const b = parseInt(input[1]);

console.log(a + b);
