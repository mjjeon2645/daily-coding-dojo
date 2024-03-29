## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 올해의 카카오 기출문제!
- 고객 약관 동의를 얻어 수집된 개인정보 n개. 각각 1~n까지 번호가 매겨있음
- 약관마다 유효기간이 다르며 1개월은 28일로 되어있다고 가정
- 오늘 날짜를 의미하는 문자열 today, 약관의 유효기간을 담은 1차원 문자열 배열 terms, 수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies
- 파기해야 할 개인정보 번호를 오름차순으로 1차원 정수배열에 담아 리턴해야 함
- 약관 terms의 길이는 1부터 20까지. 원소는 약관종류 유효기간 형태임
- 약관 종류는 A~Z 중 알파벳 대문자 하나임. terms 배열에서 약관 종류는 중복되지 않음
- 유효기간은 달 수를 나타내는 정수이며 1 이상 100 이하
- privacies의 길이는 1부터 100개 이하. privacies의 날짜는 개인정보가 수집된 날짜를 나타내며, today 이전의 날짜만 주어짐
- today, privacies에 등장하는 날짜의 yyyy는 2000 이상 2022 이하. mm이나 dd는 한자릿수인 경우 앞에 0이 붙음

### 2. 계획
- 우선 햇수가 변하는 것이나 몇 달을 더했을 때, 그리고 오늘 날짜에 대한 계산 등등을 하려면 개인정보 수집 일자(privacies)는 split(".")을 사용해서 int 배열로 만드는게 나을 것 같다. 그래서 그 배열의 [0]은 year, [1]은 month, [2]는 date로 변형해야 하는데 여기서 헷갈릴 수 있는 것은 앞에 0이 있는 string이 int로 변할 때는 아마 앞에 0이 사라지겠지?
- date가 1일 때는 month에 4를 더하고 date를 28로 바꿔주면 된다.
- date가 그 이상일 때는 month에 5를 더해야 하고 date는 원래 수에서 1을 빼주면 된다.
- 만약 month에 수를 더했는데 12를 초과한다면? year에 1을 더해주고 month는 총 더한 것에서 12를 뺀 값으로 치환
- 그럼 이렇게 정해진 값을 Map<Integer, String>으로 해서 사람번호(privacies의 index + 1), 최종 유효기간날짜로 만들어주고. => 순서를 지켜야함. 오름차순대로 해야하니까
- 그리고 나서 이 맵을 interator 한 다음에 today 날짜보다 하루 전날까지 해당하는 아이템들의 key값을 모아서 오름차순으로 정렬 후 리턴해주면 됨

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