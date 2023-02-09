## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 배열 numbers는 정수로 이루어짐 -> 조건에 따라 양의정수로 이루어짐 확인
- 모든 원소에 대한 뒷 큰수들을 차례로 담은 배열을 리턴
- 뒷 큰수가 존재하지 않는 원소는 -1을 담기
- 여기서 뒷 큰수란: 매열의 각 원소들에 대해 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수
- 배열의 길이는 4 이상 100만 이하. 배열 원소의 크기는 1 이상 100만 이하.

### 2. 계획
- 모든 수에 다 돈다면. 최악의 경우 99만9천9백9십9번 + 이런식으로 엄청 많아지겠지.
- 결국 효율성을 고려한 탐색을 해야 할 것 같은데..
- 우선 단순하게 모두 도는 로직을 짜보자. 그다음에 효율성을 높일 수 있는 방법을 만들자. 수련이니까!

- 시간이 많이 지나서 다른 풀이를 찾아보니 stack을 활용하라는데... 뭔 소린지는 잘 모르겠는데 함 해보자

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
- 