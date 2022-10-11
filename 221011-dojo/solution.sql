제출답안 1
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) FROM ANIMAL_INS GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE

제출답안 2
SELECT ANIMAL_TYPE, COUNT(*) AS COUNT FROM ANIMAL_INS GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE

해설
- 오늘 내용은 조금 어려워서 인터넷을 참고하여 풀었음
- 우선 SELECT 문과 COUNT 사이에 콤마가 들어가야 하는 이유에 대해 잘 이해하지 못함
- 결론적으론 우리가 원하는 결과값의 column이 각각 'ANIMAL_TYPE'과 'COUNT' 이기 때문에 콤마로 연결
- 정리하면 '출력하기 원하는 컬럼 제목'은 FROM 문이 나오기 전까지 콤마로 연결지어서 나열할 수 있음
- COUNT(*)는 해당하는 ROW의 갯수를 의미하므로 결국 원하는 데이터의 갯수라고 할 수 있음
- GROUP BY는 행을 그룹화하고 결과 그룹에 대한 집계 함수를 계산
- 결과 행은 cat이 먼저 와야하므로 오름차순 정렬인 ORDER BY를 사용
