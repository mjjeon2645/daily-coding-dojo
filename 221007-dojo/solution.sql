- 제출답안
SELECT ANIMAL_ID, NAME, DATETIME FROM ANIMAL_INS ORDER BY NAME, DATETIME DESC

- 풀이
1. 구하고자 하는 것은 ANIMAL_ID, NAME, DATETIME 이므로 SELECT 문에 이어서 작성
2. 원본 테이블 설정을 위해 FROM ANIMAL_INS
3. 정렬해야 하는 조건이 여러가지임. 먼저는 이름을 사전순으로 정렬
   이에 따라 ORDER BY NAME을 기재하였음(ASC는 선택사항. 디폴트 값이므로)
4. 만약 이름순으로 정렬을 했을 때 이름이 같다면 그 동물에 대해서는 DATETIME이 최신것이어야 하므로
   DATETIME에 대해서는 내림차순 정렬(최신것이 가장 먼저 오도록)
5. ORDER BY에 대한 정렬 기준이 여러개일 때에는 콤마로 나열식 기재를 하면 된다는 것을 배웠음
