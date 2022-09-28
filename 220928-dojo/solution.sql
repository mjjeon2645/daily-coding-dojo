제출답안 
SELECT NAME, DATETIME FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC

풀이과정
1. 알고자 하는 컬럽의 이름을 SELECT, FROM을 활용하여 먼저 작성하였음
   SELECT NAME, DATETIME, ANIMAL_ID FROM ANIMAL_INS
2. 문제에서 요구한 사항은 NAME, DATETIME 두 개의 컬럼이었으나 조건중에 
   ANIMAL_ID 역순으로 정렬하는 조건이 있어서 확인하고자 선택
3. 정렬문인 ORDER BY에 ANIMAL_ID를 적용하였음. 기본값은 오름차순이므로 
   역순 정렬을 위해 DESC 조건을 함꼐 붙여 아래와 같이 1차 작성
   SELECT NAME, DATETIME, ANIMAL_ID FROM ANIMAL_INS ORDER BY ANIMAL_ID DESC
4. ANIMAL_ID의 역순 정렬에 따라 다른 데이터 역시 역순정렬됨을 확인하였고 최종 담안을
   위와 같이 정리하여 제출
