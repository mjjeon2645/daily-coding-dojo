// 원하는 것
// 1. 내야 할 금액과 소지하고 있는 금액(price)의 차액 구하기
// 2. 놀이기구 이용 요금 전체 합에 비해 수중에 있는 돈이 많거나 같다면 리턴값을 0

// 아는 것
// 1. 놀이기구 이용료 1 <= price <= 2,500 (이용료 price는 자연수)
// 2. 처음 소지금액 1 <= money <= 1,000,000,000 (소지금액 money는 자연수)
// 3. 놀이기구 이용 횟수 1 <= count <= 2,500(count는 자연수)

// 계획
// solution 1
// - 놀이기구 전체요금 계산
// - 소지금액에서 전체 요금 빼기
// - 소지금이 부족하면 차액의 부호를 양의 부호로 바꾼 뒤 리턴
// - 부족하지 않으면 0 리턴

public class Solution {
  public long solution(int price, int money, int count) {
    long answer = 0;
    long totalPrice = 0;

    for (int i = 1; i <= count; i += 1) {
      totalPrice += price * i;
    }

    long difference = money - totalPrice;

    if (difference < 0) {
      answer = (- 1) * difference;
      return answer;
    }

    return answer;
  }
}
