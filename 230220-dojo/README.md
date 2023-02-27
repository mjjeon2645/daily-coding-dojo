## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 수확한 귤 중 k를 골라 상자 하나에 담아 판매
- 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고자 함
- 한 상자에 담으려는 귤의 개수 k, 귤의 크기를 담은 매열 tangerine
- 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최소값을 리턴

### 2. 계획
- k와 tangerine의 length가 같다면 tangerine을 set으로 전환한 다음 set의 size를 리턴

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
- 30분 정도 고민해서 풀어보다가 안풀려서 빠르게 다른 풀이 보고 풀어봤다.
- 내가 푼 방식이랑 dictionary 방식이랑 무엇이 그렇게 달라서 답도 다르고 시간초과 부분도 다를까. 어쨌든 자바스크립트 쪽에서는 array랑 object를 잘 활용하는게 관건일 것 같다.
- 자바는 너무 오랜만에 풀어서 내가 뭘 어떻게 풀고있는건지도 헷갈리고 잘 모를만큼 낯설게 느껴졌는데 심각쓰. 문제를 풀었지만 그리 기쁘지 않음.