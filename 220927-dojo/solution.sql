첫번째 풀이 방법
1) 구하고자 하는 것은 (1) 가장 최근에 들어온 동물이 (2) 언제 들어왔는지이다.
2) 따라서 테이블 전체를 선택하지 않아도 되며 DATETIME 컬럼만 선택했다.(SELECT DATETIME)
3) 해당 컬럼은 ANIMAL_INS 테이블에 속해있다.
4) 가장 최근에 들어온 시각을 구해야 하므로 DATETIME을 내림차순으로 정렬한다.(ORDER BY DATETIME DESC)
    다만 ORDER BY의 정렬 기본값은 오름차순(ASC)이므로 반드시 DESC 조건이 붙어야한다
5) 정렬한 데이터에서 '가장 최근' 데이터만 필요하므로 출력될 데이터의 최대값을 1개로 지정한다(LIMIT)

제출답안
SELECT DATETIME FROM ANIMAL_INS ORDER BY DATETIME DESC LIMIT 1


두번째 풀이 방법
1) 코딩테스트 연습에 힌트로 SUM, MAX, MIN이라는 부분이 붙어있으므로 이를 구글링해서 찾아보고 풀어본다.
2) MAX 함수는 숫자 뿐만 아니라 문자형 데이터에서도 사용 가능하다고 한다.
3) 구하고자 하는 것이 DATETIME 컬럼의 가장 최근값(즉 최대값)이므로 해당 컬럼이름을 MAX 함수에 인자로 준다.
4) 단 구하고자 하는 베이스 DB(ANIMAL_INS)는 FROM 으로 같이 따라와야 함(SQL의 규칙같은 것인듯.)

제출답안
SELECT MAX(DATETIME) FROM ANIMAL_INS