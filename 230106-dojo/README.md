## 1. 이해

---
- 모르는 것은 무엇인가?
- 주어진 것은 무엇인가?
- 자료는 무엇인가?
- 조건은 무엇인가?
- 조건은 알아내야 하는 것을 찾는데 충분한가?
---
- 게시판 불량 이용자를 신고하고 처리하는 결과를 메일로 발송하는 시스템 개발
- 각 유저는 한 번에 한 명의 유저를 신고 가능.
- 신고 횟수에 제한은 없음. 서로 다른 유저 계속해서 신고 가능
- 한 유저를 여러번 신고 가능하나, 동일한 유저에 대한 신고 횟수는 1회 처리
- K번 이상 신고된 유저는 게시판 이용 정지됨. -> 해당 유저를 신고한 모든 유저에게 정지사실을 메일로 발송
- 유저가 신고한 모든 내용을 취합해 마지막에 한꺼번에 게시판 이용 정지를 시키면서 메일 발송함
- 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 리턴하는 함수 완성.
- id_list의 길이는 2 이상 1천 이하(모든 유저의 아이디가 담긴 배열)
- id_list의 원소의 길이는 1 이상 10 이하. 알파벳 소문자로만 이루어져 있으며 중복값 없음
- report 배열의 길이는 1 이상 20만 이하(결국 한명이라도 신고는 했다는 얘기임)
- report 원소의 길이는 3 이상 21 이하. 원소 형태는 이용자id 신고한id이며 자기 자신을 신고하는 경우는 없음
- k는  1 이상 200 이하

### 2. 계획
- 수요일에 풀지 못한 문제. 다시 한번 풀어보자.
- 단계별로 이해가 되는 부분까지 해보자. 먼저 report 배열에서는 중복값이 있을 수 있다. 한 사람이 다른 사람을 여러번 신고할 수 있으니까. 이 중복값을 없애기 위해 map이나 set을 사용해야 할 것 같은데 우선은 map으로 실험을 해보면서 실제로 중복값이 더해지지 않는지를 확인해보기.
- 실험해봤는데 map일때 너무 중대한 문제가 생김. 바로 key값이 중복. 그래서 set으로 해야할 것 같음. 다시 set으로 전환..!
- 중복은 제거했고. 그럼 이 중복을 제거한 raw real report로 무엇을 할 것인지 정해야 한다.
- 이제 map 구조를 이용하면 어떨까? Map<String, List<String>> 형태가 될 수 있을런지. key값은 신고 당한(reportedUser), List<String>은 신고한 사람들(reporting user)의 목록. 그렇다면 신고당한 사람의 순서도 id_list와 동일하게 설정하고. List<String>의 경우, report.map(item -> item.split(" ")[1])
- 위에것까지 완성했다. 그럼 이번엔 뭘 할수 있을까. 지금 map의 세팅 상태가 아래와 같음
- <신고당한 id, 신고한 사람들의 리스트> => 이미 list를 만들 때 k를 기준으로 해당안되는 것들은 제외했음
- 이제 이 리스트를 가지고 최종 결과물을 내면 될 것 같음..


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
- 자바는 결국 시간 초과를 해결하지 못했고 자바스크립트는 정말 개같이 풀어서 ;;;;; 한번도 내 힘으로 풀어보지 못했던 이 문제를 드디어 풀어낼 수 있었다....
- 요즘 계속 마음이 꺾였었는데 이런 소소한 성공들을 잘 기억해두고 언젠간 내가 할 수 있다는 마음으로 해내는 것이 중요할 것 같다.
- 얼마 전에 다시 복습했던 리덕스의 객체 활용 방법을 통해서 만들어보았는데... 이런 방법을 더 연습해보아야겠다.
