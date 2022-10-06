제출 답안
SELECT ANIMAL_ID FROM ANIMAL_INS WHERE NAME IS NULL

풀이과정
1. 이름이 없는채로 들어온 동물의 ID를 조회하는 조건
   결론적으로 우리가 필요한 것은 ANIMAL_ID 컬럼의 정보이므로 SELECT 문에 ANIMAL_ID를 기재
2. 정보의 출처인 테이블은 ANIMAL_INS 이므로 FROM ANIMAL_INS 기재
3. 어떤 조건을 부여해야 할 때는 WHERE 문을 활용한다는 점을 어제 서치 중에 찾아서 기재해봄
4. 어떤 조건인지를 WHERE 문에 기재해주면 되고, 이름이 없는 채로 들어온 자료들을 찾아야 하므로 
   NAME IS NULL 기재하여 통과
