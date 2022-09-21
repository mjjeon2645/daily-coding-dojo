// 최소공배수의 정의. 두 수의 배수 중 공통이 되는 가장 작은 숫자
// 최대공약수를 구해주어야 해결이 될 것 같은데 인터넷에 검색하니 최대공약수는 '유클리드 호제법'으로 구할수 있다고 함
// 유클리드 호제법 => 두 수 A, B. A % B = C => 이 과정을 계속 반복반복.
// C가 0이 되었을 때 나누는 수가 '최대공약수'
// 즉 나머지가 0이 되는 시점까지 동일한 연산을 계속해야 하므로 재귀라고 함. 아하..
// 두 수의 최소공배수는 어떻게 구하냐? => A * B 를 최소공배수로 나눠주면 된단다.

// 우선 가장 쉬운것부터. 배열이 1개 들어올 때는 그 배열 값 그대로를 뱉어내면 됨. length가 1인 것.
// 근데 수가 2개가 아니라 배열로 들어오니까 계속 돌려면..for문이 쓰이긴 해야할듯.
// 1개부터 해보자.

class Solution {
  public int solution(int[] arr) {
    int answer = 0;

    answer = process(arr);

    return answer;
  }

  public int process(int[] arr) {
    if (arr.length == 1) {
      return arr[0];
    }

    // 원소가 2개 이상인 경우 이제 최대공약수를 구하여 최소공배수를 구해야 함
    // 최대공약수를 구하려면.... 재귀..... 계속 나누기...
    int standardNumber = arr[0];

    for (int i = 0; i < arr.length; i += 1) {
      standardNumber = findLcm(standardNumber, arr[i]);
    }

    return standardNumber;
  }

  public int findLcm(int a, int b) {

    int gcd = findGcd(a, b);

    return a * b / gcd;
  }

  public int findGcd(int a, int b) {
    while(b > 0) {
      int remain = a % b;
      a = b;
      b = remain;
    }
    return a;
  }
}
