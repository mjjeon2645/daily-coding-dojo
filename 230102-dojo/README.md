## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 정수 배열에는 0~9까지의 숫자 일부가 들어가있음
- 이 배열에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return
- 배열의 길이는 1부터 9까지
- 배열의 모든 원소는 0부터 9까지
- 배열 안의 모든 원소는 서로 다름

### 2. 계획
- 0부터 9까지 모두 더한 다음에 해당 array의 원소의 합을 빼주면 되는거 아닌가...?

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
- 어... 생각보다 너무 문제가 쉬운 것이라서 좀 당황스러운데.
- 한편으론 이 문제를 다른 방법으로 어떻게 풀어볼 수 있을지를 고민하는게 생산적일 수 있겠다는 생각도 든다.
- 어쨌든 0부터 9까지 모두 더하는 것을 직접 할 것인지 내장 기능을 통해 할 것인지 고민했는데 아마도 예전에는 직접 다 더하는 방법을 택했을 것 같지만 오늘은 stream으로 해 보았다. sum() 같은 메서드가 있을 거라 추측했는데 역시 있었어서 활용함
- 오히려 자바스크립트를 어떻게 해야하나 고민스럽네. 근데 이것 역시도 reduce를 활용하면 금방 해결될듯.
