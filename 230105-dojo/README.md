## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 일부 학생이 체육복을 도난당함. 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 함
- 바로 앞번호나 뒷번호 학생에게만 체육복을 빌려줄 수 있음
- 최대한 많은 학생이 체육수업을 듣도록 해야 함
- 전체 학생 수 n은 2명 이상 30명 이하
- 도난당한 학생들의 번호가 담긴 배열 lost. 도난당한 학생 수는 1명 이상 n명 이하. 중복번호 없음
- 여벌의 체육복 가져온 학생들의 번호가 담긴 배열 reserve. 해당 학생들의 수는 1명 이상 n명 이하. 중복 번호 없음
- 여벌 체육복이 있는 학생만 다른 학생에게 빌려줄 수 있음.
- 여벌 체육복을 가져온 학생이 도난당했을 수도 있음. 남은 체육복이 하나이므로 다른 학생에게는 빌려줄 수 없음

### 2. 계획
- 힌트에 탐욕법이라고 써있다.(greedy) 사실 봐도 잘 모르겠음...
- 우선 lost의 원소와 reserve의 원소가 동일하다면 lost에서도 빼주고 reserve에서도 빼야할 것 같다.
- 그리고 나서 lost의 배열 길이를 n에서 빼서 최소값을 정하고.
- 그 다음 lost 원소를 하나씩 돌면서 reserve가 빌려줄 수 있다면 n에 1씩 더해준 뒤에 모든 lost를 다 돌고나면 return을 하면 되지 않을까.

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
- 처음으로 거의 다 풀어낸 것 같다. 계속 테스트케이스 13, 14번이 해결되지 않아 시간을 좀 써서 고민하다가, 답이나올 기미가 안보여서 힌트를 봤는데 다른 사람들이 이 부분에 대한 힌트를 준 것을 보고 lost, reserve 배열을 오름차순으로 정렬하는 코드를 추가하니 해결됐다.
- 아주 깔끔한 코드는 아니지만 그래도 거의 다 풀어냈다는 점에 의의를 ㅠㅠㅎㅎ. 자바는 그래도 for문이나 stream을 사용해서 풀었는데 이걸 어떻게 자바스크립트로 풀어내지????? 벌써 걱정이 한가득.
