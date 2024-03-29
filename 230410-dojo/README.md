## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- m은 롤러의 길이로 연속으로 칠할 수 있는 영역의 갯수를 의미하기도 함. 하지만 구역의 일부분만 포함되도록 칠해서는 안 됨

### 2. 계획
- 양 끝에서부터 커버해나가면서 조금 더 많은 섹션을 칠하는 쪽을 선택해나가면 되지 않을까.
- 첫번째 사이클에서 (1) section[0]에 m - 1을 더했을 때 section의 몇번째 원소까지 커버하는지, (2) section[section.length - 1]에서 m - 1을 뺐을 때 section의 몇번째 원소까지 커버하는지 비교한 후 더 많이 칠하는 쪽을 선택
- 그 다음 칠한쪽에서 또다시 m - 1을 더하거나 빼면서 비교해서 더 큰 방향을 선택
- 너무 복잡할 것 같긴 한데... 

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
- 굉장히 어려운 문제일 줄 알았는데 아주 단순한 문제여서 약간 허무하기도 했다.
- 알고리즘의 덫에 빠진 기분인데, 이것 저것 생각하지 말고 그냥 해보는 데에 집중하자.
