제출 답안
SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.NAME
FROM ANIMAL_INS
LEFT JOIN ANIMAL_OUTS
ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE ANIMAL_INS.DATETIME > ANIMAL_OUTS.DATETIME
ORDER BY ANIMAL_INS.DATETIME

풀이
1. 전혀 모르던 내용이 나와서 우선 아는 내용에 한해서만 작성해 봄
2. 선택해야 하는 것은 명확하므로 ANIMAL_ID, NAME 두가지였음
   단 어떤 테이블에서 선택하느냐의 문제였는데 마치 자바스크립트처럼 선택자로 '.'을 활용한다는 사실을 새롭게 알게됨
   따라서 ANIMAL_INS라는 특정 테이블에 있는 컬럼을 선택할 때에는
   ANIMAL_INS.선택하려는컬럼명 => 이런 식으로 표현이 가능함
3. 헷갈렸던 점은 '외래키'라는 명칭이 붙은 ANIMAL_OUTS라는 테이블의 컬럼이었음
   어쨌든 두 테이블이 뭔가 결합되어 선택되어야 한다는 생각이 있었지만 잘 몰라 인터넷을 찾아봄
4. JOIN에 대해 새롭게 알게됨. 단어에서도 나와있듯이 두 개 이상의 테이블을 서로 연결하여 데이터를 검색할때 사용
   두 개의 테이블을 마치 하나의 테이블인 것처럼 보여줌
5. JOIN의 종류는 Inner, Natural, Outer, Cross 등이 있는데 이번 문제 풀이에서는 Outer 중에서도 Left(Outer) JOIN 사용
6. LEFT JOIN은 LEFT OUTER JOIN과 동일함. 왼쪽 테이블을 기준으로 일치하는 행만 결합되고 일치하지 않으면 null로 채워짐
   기본 신택스는 아래와 같음
   SELECT 조회하려는 컬럼
   FROM 기준이 되는 테이블
   LEFT JOIN 합치려는 테이블
   ON 조건문
   (필요 시 WHERE 조건)
