제출 답안
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS ORDER BY ANIMAL_ID

풀이과정
1. 문제에서 요구하는 것이 무엇인지 먼저 파악하였음
   - 문제에서는 모든 동물의 'id'와 '이름'을 알고자 함
   - 이에 따라 SELECT 문에는 구하고자 하는 2가지를 콤마(,)로 나열하여 
     SELECT ANIMAL_ID, NAME
2. 기준이 되는 데이터는 ANIMAL_INS라는 테이블에서 가져옴
   - FROM ANIMAL_INS
3. 조회에 대한 조건은 ANIMAL_ID 순. 따라서 테이블의 데이터들은 ANIMAL_ID가 
   오름차순으로 정렬된 상태여야 함
   - ORDER BY ANIMAL_ID (기본값이 오름차순. 내림차순일때는 DESC 추가 필요)
