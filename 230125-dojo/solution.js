// 문제링크: https://www.hackerrank.com/challenges/magic-square-forming/problem

function formingMagicSquare(s) {
    // Write your code here
    
    const standard = [];
    
    standard.push([[8,3,4],[1,5,9],[6,7,2]]);
    standard.push([[4,3,8],[9,5,1],[2,7,6]]);
    standard.push([[6,1,8],[7,5,3],[2,9,4]]);
    standard.push([[2,9,4],[7,5,3],[6,1,8]]);
    standard.push([[2,7,6],[9,5,1],[4,3,8]]);
    standard.push([[6,7,2],[1,5,9],[8,3,4]]);
    standard.push([[4,9,2],[3,5,7],[8,1,6]]);
    standard.push([[8,1,6],[3,5,7],[4,9,2]]);
    
    let min = Number.MAX_VALUE;
    
    for (let i = 0; i < 8; i += 1) {
        let minCost = 0;
        
        for (let j = 0; j < 3; j += 1) {
            for (let k = 0; k < 3; k += 1) {
               minCost += Math.abs(standard[i][j][k] - s[j][k]); 
            }
        }
        if (min > minCost) {
            min = minCost;
        }
    }
    
    return min;
}
