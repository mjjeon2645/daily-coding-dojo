## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 놀이기구의 원래 이용료: price
- 놀이기구를 N번째 이용하면 price의 N배를 내야 함
- 눌이기구를 count 번 타면 현재 소지금액에서 얼마가 모자라는지를 리턴
- 금액이 부족하지 않을 경우 0을 리턴
- price는 1 이상 2,500인 자연수
- 원래 소지금액은 1 이상 10억. 자연수.
- 놀이기구 이용 횟수는 1 이상 2500 이하인 자연수

### 2. 계획
- 총 내야 할 금액을 for문으로 구할 수 있지 않을까. 1회일 떄는 price * 1, 2회일 때는 price * 1 + price * 2
- for문도 for문인데 결국 재귀인듯.
- 그럼 reduce 활용은 불가한가...? 우선 for문으로 푼다음에 reduce를 생각해보자.

---
계획을 세우기 전에 아래와 같은 질문을 던지면 굉장히 유용합니다.

계획을 세운 뒤 아래 질문을 통해 한번 더 점검합니다.

- 자료와 조건은 모두 활용 했는가? (Edge case가 될 조건을 꼭 확인합니다. 보통은 이걸 놓쳐서 지옥에 빠지죠.)
---

### 3. 실행

코딩을 하는 단계입니다. 물론 Test case부터 먼저 작성 해야겠죠?

- 각 단계가 올바른지 명확히 알 수 있는가?
- 그것이 옳다는 것을 설명할 수 있는가?

---

### 4. 반성

반성이 제일 중요합니다. 반성한 부분을 다음날 훈련에 반영합니다.
- 자바로는 쉽게 풀었다. for문을 활용해서 풀었는데 자바스크립트에서는 재귀나 reduce를 사용할 수 없는건지 한번 더 확인해보자.