첫 번째 제출답안
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NOT NULL

첫 번째 풀이과정
1. 구하고자 하는 것은 ANIMAL_ID 이므로 SELECT 문에 ANIMAL_ID 작성
2. 원본 테이블을 FROM 문 뒤에 작성하여 FROM ANIMAL_INS
3. '이름이 있는 동물'을 구하는 것이 조건이므로 WHERE 문을 작성하는데
    자바의 JUnit assertion 문에서 활용하는 IS NOT NULL이 동일하게 적용되는지 실험
    제출답안이 정답으로 판정되어 IS NOT NULL이 SQL에서도 동일하게 적용됨을 확인

두 번째 제출답안
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME != ''

두 번째 풀이과정
1. 문법이 어떻게 적용되는지 궁금하여 처음에는 WHERE NAME != NULL 로 작성해보았는데 작동하지 않음
2. NULL 로 적용할 수 없는건가 하여 '문자열 공란'과 같지 않다 라는 조건인 !='' 로 적용 시 통과
