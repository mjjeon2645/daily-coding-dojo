제출답안
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION = 'Sick' ORDER BY ANIMAL_ID

풀이
1. 구하고자 하는 것은 아픈 동물(조건)의 '아이디'와 '이름'. 따라서 SELECT 문에 ANIMAL_ID와 NAME을 콤마로 나열
2. 구하려는 원본 데이터를 FROM ANIMAL_INS로 작성
3. 조건은 '아픈 동물'임. 따라서 INTAKE_CONDITION 이 'Sick'인 상태의 데이터들만 추려야 하므로 조건을 나타내는 WHERE 활용
   WHERE INTAKE_CONDITION = 'Sick'으로 나타냈는데 여기서 헤맨것은 Sick를 따옴표로 감싸주지 않아서 헤맸음
   문자열의 경우 다른 언어들과 비슷하게 따옴표로 감싸고, 숫자의 경우는 그렇지 않음
4. 추가 조건으로 '아이디 순 조회'가 주어졌기 때문에 ORDER BY ANIMAL_ID를 작성(오름차순이 디폴드값이므로 별도로 ASC 쓰지 않음
