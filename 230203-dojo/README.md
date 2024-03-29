## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 문제 제목 -> binary gap
- binary gap이란 maximal sequence인데 연속적인 0의 시퀀스임. 끝이 1로 둘러싸인.
- 예로 9라는 integer가 주어졌을 때 2진수로는 1001로 표현되는데 길이 2의 binary gap이 있음. 
- 529의 경우 2진수로는 1000010001로 표현 가능한데 2개의 binary gap이 존재함. 하나의 길이는 4, 그리고 나머지의 길이는 3
- 20의 경우 10100으로 치환되며 binary gap의 갯수는 1, 길이도 1
- 15는 1111로 binary gap 없음. 32도 마찬가지
- solution이라는 함수는 가장 긴 길이의 binary gap을 리턴하며 바이너리 갭이 없으면 0을 리턴해야 함
- 제한사항: integer의 범위는 1 ~ 2,147,483,647

### 2. 계획
- 궁금. 제한사항의 끝 수가 굉장히 크다는 게 의미하는점이 무엇인가.
- 어차피 주어지는 인티저는 하나이기 떄문에 2진수로 만들긴 해야함 -> 수가 크다면 2진수로 만드는 자체가 시간이 좀 걸릴 것. -> 이게 문제가 되지는 않는가?
- 2진수로 만들고 나서 -> 인터벌을 구하기 전에 가드 클로즈부터. 1이 0개 또는 1개일 경우에 0을 리턴하고 모든 루프 종료
- 그리고 나서는 어떻게 풀..? -> 이 2진수 문자열을 split해서 1의 index만 구한 다음에 index간의 간격이 가장 긴 것을 리턴하면 되지 않을까.

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
- 우선 스스로 제한했던 시간인 1시간 30분 안에 자바, 자바스크립트로 풀긴 했는데 제일 신경쓰였던 부분이 바로 시간 복잡도였다. 풀어지냐 아니냐를 떠나서 효율적인 코드인가를..
- 풀고나서 검색해보니 자바스크립트 부분은 좀 더 나은 풀이가 있는 것 같아서 이 부분은 TIL로 작성하려 함.
