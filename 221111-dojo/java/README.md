### 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 오늘 반영해야 할 과거의 반성 -> 문제를 제대로 읽자. 적어도 문제를 제대로 읽지 않아서 풀지 못하는 일은 없도록하자.
- 주어진 것: Lempel-Ziv-Welch 압축을 구현하기로 했다는 점
- 길이가 1인 모든 단어를 포함하도록 사전 초기화
- 사전에서 '현재 입력'과 일치하는 가장 긴 문자열(w)찾기
- w에 해당하는 사전의 색인 번호를 출력하고 입력에서 w 제거
- 입력에서 처리되지 않은 다음 글자가 남아있을 경우(c) w+c에 해당하는 단어 사전에 등록
- 이를 반복
- 

### 2. 계획

---
계획을 세우기 전에 아래와 같은 질문을 던지면 굉장히 유용합니다.

- 관련된 문제를 알고 있는가?
- 모르는 부분이 유사한 다른 문제를 풀어 본 적이 있는가?
- 전에 풀어 본 문제를 활용하려면 어떤 보조 요소를 도입해야 되는가?
- 도움이 될 것 같은 어떤 사실이나 정리를 알고 있는가? (보통은 자료 구조나 수학적 공리 또는 정의가 해당될 겁니다.)

계획을 세운 뒤 아래 질문을 통해 한번 더 점검합니다.

- 자료와 조건은 모두 활용 했는가? (Edge case가 될 조건을 꼭 확인합니다. 보통은 이걸 놓쳐서 지옥에 빠지죠.)

---

- 문제가 너무 어려운데..;;
- 우선 예시인 kakao만 가지고 구현하는 연습을 해야겠다.
- 한글자씩 비교해야 하니까 입력받는 문자열을 split해서 모두 쪼개야 하는 것 아닐까.
- 그 쪼갠 값들을 큐나 스택에 넣고 해결..?왜냐면 어차피 순서대로 쪼개지는 것이기 때문에 큐같은 경우에는 
split한 문자열을 큐에 쭉 넣은 다음에 먼저 들어간 순서대로 빠질 것 같아서.
- 그럼 사전은 어떻게 구현할 것인가? 사전은 해시맵 같은걸로 하면 안될까? 중복된 값이 들어갈 수 없으면서 동시에 인덱스까지 나타낼 수 있는.
- key를 문자열로 주고 value를 인덱스로 가져오면..?
- 기존의 사전은 아스키코드를 활용하는 방법밖에는 없어보인다 저것까지 만들면 너무 로드가 큼.
- A to Z 아스키코드 넘버는 65 to 90
- 그럼 어떤 문자열이 들어왔을 때 비교하는 대상이 총 2가지임.
- 하나는 원래 있는 사전, 또 하나는 비교를 하면서 만들어낸 사전 => 근데 이건 초기에 사전 하나로 통일할 수 있을 듯
- 어차피 65부터 90까지 for 문 돌리면서 key는 문자열로, value는 for문의 인덱스 값으로 줄 수 있음
- (1) 사전을 만들고(hashmap)
- (2) 입력받은 값을 for문이 되었건 split을 했건 돌려서 큐나 스택에 집어넣고
- 맨 아래 들어간 것들을 만든 딕셔너리에 비교한 다음에 없는 값은 딕셔너리에 key와 밸류값 해서 집어넣고
- 스택이나 큐에 있는 문자열은 없애버리고. 이 방법으로 실행해보자.

---

### 3. 실행

코딩을 하는 단계입니다. 물론 Test case부터 먼저 작성 해야겠죠?

- 각 단계가 올바른지 명확히 알 수 있는가?
- 그것이 옳다는 것을 설명할 수 있는가?

질문을 보면 아시겠지만 이게 TDD를 같이 하는 이유입니다.

Test code를 통해 각 단계가 올바르게 동작하는 것을 증명할 수 있기 때문입니다.

사람의 머리로는 증명할 수 없습니다. 명심하세요! 증명은 코드를 통해 합니다.

---

### 4. 반성

반성이 제일 중요합니다. 반성한 부분을 다음날 훈련에 반영합니다.

- 다른 방법으로 해결할 수는 없었는가? (다른 사람의 풀이도 참고하면 좋습니다.)
- 결과나 방법을 다른 문제에 활용할 수 있는가? (유용한 패턴은 계속 써먹을 수 있죠.)

- 카카오 문제는 볼때마다 어렵다 ㅎㅎ 하지만 다른 풀이들을 보면 문제에 제시된 대로 하면 된다고 하니...
- 이번 답안도 결국 시간들여 풀다가 해결하지 못해서 인터넷을 참고했는데, 생각보다 어려운 문제는 아니었던 것 같다.
- 사전을 보면서 HashMap을 떠올린건 당연한 것이지만 결국에는 안에 있는 메서드를 잘 알지 못해서 좀 헤맸음
- for문과 while문이 중첩되는 것이 보기 좋지 않아보여도 결국에는 시간 안에 푸는것이 더 중요하다.
- 자바스크립트로 풀어볼 때에도 for나 while, 그리고 변수를 immutable하게 하는 것이 거의 불가능할 것 같은데 그래도 최선을 찾아보기