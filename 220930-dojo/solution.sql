제출답안
SELECT NAME FROM ANIMAL_INS ORDER BY DATETIME LIMIT 1

1. 동물 보호소에 가장 먼저 들어온 동물의 이름을 조회해야 함
2. 동물의 '이름'을 요구하는 문제이므로 SELECT NAME
3. 주어진 표에서 찾아야 하므로 FROM ANIMAL_INS
4. 가장 먼저 들어온 것이라는 조건을 찾기 위해 DATETIME을 오름차순으로 정렬
   ORDER BY DATETIME 문법으로 정렬. ORDER BY의 기본 조건이 오름차순임
5. 그 중에서 '가장 먼저'의 조건을 충족시키기 위해 출력값의 갯수를 1개로 제한하는
   LIMIT 1 추가
