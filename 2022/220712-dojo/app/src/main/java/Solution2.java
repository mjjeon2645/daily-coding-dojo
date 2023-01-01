// 계획
// solution 2
// - 내 소지금액에서 놀이기구 이용료를 감액
// - 감액 종료 후 잔액이 0, 또는 양수라면 0 리턴, 음수라면 양의 부호로 바꾼 뒤 리턴
// - 주의. price와 money가 int로 정의되어 있으므로 오류 발생 소지

public class Solution2 {
  public long solution(int price, int money, int count) {
    long answer = -1;

    int i = 1;
    long longPrice = price;
    long longMoney = money;

    while ( i <= count) {
      longMoney -= longPrice * i;
      i += 1;
    }

    answer = longMoney < 0 ?
        - 1 * longMoney :
        0;

    return answer;
  }
}
