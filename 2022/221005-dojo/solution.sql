제출 답안
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS WHERE INTAKE_CONDITION != 'Aged' ORDER BY ANIMAL_ID

풀이 과정
1. 구하고자 하는 것은 ANIMAL_ID와 NAME 이므로 SELECT 문에 ANIMAL_ID와 NAME을 나열
2. 원본 데이터는 ANIMAL_INS이므로 FROM 문에 ANIMAL_INS 이어줌
3. 문제 조건에 따르면 INTAKE_CONDITION이 'Aged'가 아닌 경우를 선택해야 하므로
   조건문인 WHERE에 INTAKE_CONDITION이 'Aged'와 같지 않다 라는 뜻의 != 를 붙여주었는데 작동함
4. ANIMAL_ID 순으로 출력되어야 하므로 ORDER BY를 삽입(기본값인 오름차순으로 정렬)
